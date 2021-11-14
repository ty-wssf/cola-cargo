package com.rickie.cargo.executor;

import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.cola.exception.BizException;
import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.gateway.CargoBookingGateway;
import com.rickie.domain.model.gateway.CargoRoutingGateway;
import com.rickie.domain.model.valueobjects.CargoItinerary;
import com.rickie.dto.data.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingCmdExe.java
 * @Description TODO
 * @createTime 2021年07月11日 14:48:00
 */
@Component
public class CargoRoutingCmdExe {
    @Autowired
    private CargoRoutingGateway cargoRoutingGateway;

    @Autowired
    private CargoBookingGateway cargoBookingGateway;

    public SingleResponse<String> execute(String bookingId) {
        SingleResponse<String> exeResponse = SingleResponse.of(bookingId);
        Cargo cargo = cargoBookingGateway.getByBookingId(bookingId);
        if(cargo == null) {
            throw new BizException(ErrorCode.BOOKINGID_NOT_EXIST.getErrCode(), ErrorCode.BOOKINGID_NOT_EXIST.getErrDesc());
        }
        SingleResponse<CargoItinerary> routingResponse = cargoRoutingGateway.routeCargo(cargo);
        if(routingResponse.isSuccess()) {
            // 分配包裹路线
            cargo.assignToRoute(routingResponse.getData());
            // 更新routing_status
            cargoBookingGateway.updateRoutingStatus(cargo);
        }

        return exeResponse;
    }
}
