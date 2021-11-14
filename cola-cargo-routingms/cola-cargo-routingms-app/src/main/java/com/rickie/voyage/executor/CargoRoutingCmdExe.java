package com.rickie.voyage.executor;

import com.alibaba.cola.dto.MultiResponse;
import com.rickie.domain.model.gateway.CargoRoutingGateway;
import com.rickie.domain.model.aggregates.Voyage;
import com.rickie.dto.CargoRoutingCmd;
import com.rickie.dto.data.VoyageDTO;
import com.rickie.voyage.convertor.VoyageDTOConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingCmdExe.java
 * @Description TODO
 * @createTime 2021年07月08日 21:19:00
 */
@Component
public class CargoRoutingCmdExe {
    @Autowired
    private CargoRoutingGateway cargoRoutingGateway;

    public MultiResponse<VoyageDTO> execute(CargoRoutingCmd cargoRoutingCmd) {
        List<Voyage> voyages = cargoRoutingGateway.findAll();
        return MultiResponse.of(VoyageDTOConvertor.toDTO(voyages));
    }
}
