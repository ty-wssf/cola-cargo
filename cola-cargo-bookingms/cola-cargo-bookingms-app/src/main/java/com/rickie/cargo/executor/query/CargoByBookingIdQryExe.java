package com.rickie.cargo.executor.query;

import com.alibaba.cola.dto.SingleResponse;
import com.rickie.cargo.convertor.CargoDTOConvertor;
import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.gateway.CargoBookingGateway;
import com.rickie.dto.data.CargoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoByBookingIdQryExe.java
 * @Description TODO
 * @createTime 2021年06月19日 18:17:00
 */
@Component
public class CargoByBookingIdQryExe {
    @Autowired
    private CargoBookingGateway cargoBookingGateway;

    public SingleResponse<CargoDTO> execute(String bookingId){
        Cargo cargo = cargoBookingGateway.getByBookingId(bookingId);
        CargoDTO cargoDTO = new CargoDTO();
        cargoDTO = CargoDTOConvertor.toDTO(cargo);
        return SingleResponse.of(cargoDTO);
    }
}
