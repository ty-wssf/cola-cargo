package com.rickie.acl;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.fastjson.JSONObject;
import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.gateway.CargoRoutingGateway;
import com.rickie.domain.model.valueobjects.CargoItinerary;
import com.rickie.domain.model.valueobjects.Leg;
import com.rickie.dto.CargoRoutingCmd;
import com.rickie.dto.data.CarrierMovementDTO;
import com.rickie.dto.data.VoyageDTO;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingGatewayCoupleImpl.java
 * @Description TODO
 * @createTime 2021年07月11日 12:17:00
 */
@Component
public class CargoRoutingGatewayImpl implements CargoRoutingGateway {
    private static String cargoRoutingUrl = "http://localhost:8081/cargorouting/optimalRoute";

    @Override
    public SingleResponse<CargoItinerary> routeCargo(Cargo cargo) {
        SingleResponse<CargoItinerary> result = SingleResponse.buildSuccess();
        RestTemplate restTemplate = new RestTemplate();
        // 构造请求参数
        CargoRoutingCmd cmd = new CargoRoutingCmd();
        cmd.setOrigin(cargo.getRouteSpecification().getOrigin());
        cmd.setDestination(cargo.getRouteSpecification().getDestination());
        cmd.setDeadline(cargo.getRouteSpecification().getArrivalDeadline());
        // 调用远程REST API
        MultiResponse<VoyageDTO> response = restTemplate.postForObject(cargoRoutingUrl, cmd, MultiResponse.class);
        if(response != null && response.isSuccess()) {
            // 将java.util.LinkedHashMap解析为VoyageDTO类型
            List<VoyageDTO> voyageDTOs = JSONObject.parseArray(
                    JSONObject.toJSONString(response.getData())
            ).toJavaList(VoyageDTO.class);
            // Console 输出结果，仅供测试验证
            if(!CollectionUtils.isEmpty(voyageDTOs)) {
                voyageDTOs.forEach(item-> System.out.println(item));
            }
            // 转换List<VoyageDTO>为领域对象CargoItinerary
            List<Leg> legs = new ArrayList<>(voyageDTOs.size());
            for(VoyageDTO voyageDTO:voyageDTOs) {
                legs.add(toLeg(voyageDTO));
            }
            // 返回结果
            result.setData(new CargoItinerary(legs));
            return result;
        }

        result.setSuccess(false);
        result.setErrCode("Route failed");
        result.setErrMessage("包裹路由失败");
        return result;
    }

    private Leg toLeg(VoyageDTO voyageDTO) {
        CarrierMovementDTO carrierMovementDTO = voyageDTO.getCarrierMovements().get(0);
        return new Leg(
                voyageDTO.getVoyageNumber(),
                carrierMovementDTO.getDepartureLocation(),
                carrierMovementDTO.getArrivalLocation(),
                carrierMovementDTO.getDepartureDate(),
                carrierMovementDTO.getArrivalDate()
        );
    }
}
