package com.rickie.cargo.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.rickie.cargo.convertor.CargoDTOConvertor;
import com.rickie.domain.model.gateway.CargoBookingGateway;
import com.rickie.domain.model.valueobjects.LastCargoHandledEvent;
import com.rickie.dto.HandlingActivityUpdateCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingActivityUpdateCmdExe.java
 * @Description TODO
 * @createTime 2021年08月13日 14:38:00
 */
@Component
public class HandlingActivityUpdateCmdExe {
    @Autowired
    private CargoBookingGateway cargoBookingGateway;

    public SingleResponse<String> execjjute(HandlingActivityUpdateCmd cmd) {
        LastCargoHandledEvent lastCargoHandledEvent = CargoDTOConvertor.toLastCargoHandledEvent(cmd);
        cargoBookingGateway.updateByLastCargoHandledEvent(lastCargoHandledEvent);
        return SingleResponse.of(lastCargoHandledEvent.getBookingId());
    }
}
