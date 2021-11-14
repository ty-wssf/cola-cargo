package com.rickie.cargo;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.rickie.api.ICargoBookingService;
import com.rickie.cargo.executor.CargoBookingCmdExe;
import com.rickie.cargo.executor.HandlingActivityUpdateCmdExe;
import com.rickie.cargo.executor.query.CargoByBookingIdQryExe;
import com.rickie.dto.CargoBookCmd;
import com.rickie.dto.HandlingActivityUpdateCmd;
import com.rickie.dto.data.CargoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoServiceImpl.java
 * @Description TODO
 * @createTime 2021年06月14日 01:05:00
 */
@Service
public class CargoBookingServiceImpl implements ICargoBookingService {
    @Autowired
    private CargoBookingCmdExe cargoBookingCmdExe;

    @Autowired
    private CargoByBookingIdQryExe cargoByBookingIdQryExe;

    @Autowired
    private HandlingActivityUpdateCmdExe handlingActivityUpdateCmdExe;

    @Override
    public SingleResponse<String> bookCargo(CargoBookCmd cargoBookCmd) {
        return cargoBookingCmdExe.execute(cargoBookCmd);
    }

    @Override
    public SingleResponse<CargoDTO> findByBookingId(String bookingId) {
        return cargoByBookingIdQryExe.execute(bookingId);
    }

    @Override
    public SingleResponse<String> updateByCargoHandledEvent(HandlingActivityUpdateCmd cmd) {
        return handlingActivityUpdateCmdExe.execute(cmd);
    }
}
