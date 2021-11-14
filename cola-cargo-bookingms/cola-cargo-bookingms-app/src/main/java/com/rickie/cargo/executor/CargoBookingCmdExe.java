package com.rickie.cargo.executor;

import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.cola.exception.BizException;
import com.rickie.domain.model.gateway.CargoBookingGateway;
import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.dto.CargoBookCmd;
import com.rickie.dto.data.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoBookingCmdExe.java
 * @Description TODO
 * @createTime 2021年06月14日 12:17:00
 */
@Component
public class CargoBookingCmdExe {
    @Autowired
    private CargoBookingGateway cargoBookingGateway;

    public SingleResponse<String> execute(CargoBookCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domain gradually
        if(cmd.getOriginLocation().isEmpty() || cmd.getOriginLocation().equals("") ||
                cmd.getDestLocation().isEmpty() || cmd.getDestLocation().equals("")){
            throw new BizException(ErrorCode.LOCATION_EMPTY.getErrCode(), "位置为空");
        }
        if(cmd.getBookingAmount()<0) {
            throw new BizException(ErrorCode.BOOKING_AMOUNT_NEGATIVE.getErrCode(), "预订数量不能为负数");
        }

        String random = UUID.randomUUID().toString().toUpperCase();
        cmd.setBookingId(random.substring(0, random.indexOf("-")));
        Cargo cargo = new Cargo(cmd);
        cargoBookingGateway.save(cargo);
        SingleResponse<String> singleResponse = SingleResponse.buildSuccess();
        singleResponse.setData(cmd.getBookingId());
        return singleResponse;
    }
}
