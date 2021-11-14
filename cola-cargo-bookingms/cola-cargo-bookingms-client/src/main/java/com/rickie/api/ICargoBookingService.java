package com.rickie.api;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.rickie.dto.CargoBookCmd;
import com.rickie.dto.HandlingActivityUpdateCmd;
import com.rickie.dto.data.CargoDTO;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName ICargoService.java
 * @Description TODO
 * @createTime 2021年06月14日 01:06:00
 */
public interface ICargoBookingService {
    SingleResponse<String> bookCargo(CargoBookCmd cargoBookCmd);
    SingleResponse<CargoDTO> findByBookingId(String bookingId);
    // 最近的包裹装卸活动
    SingleResponse<String> updateByCargoHandledEvent(HandlingActivityUpdateCmd cmd);
}
