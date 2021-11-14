package com.rickie.api;

import com.alibaba.cola.dto.MultiResponse;
import com.rickie.dto.CargoRoutingCmd;
import com.rickie.dto.data.VoyageDTO;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName ICargoRoutingService.java
 * @Description TODO
 * @createTime 2021年07月08日 21:04:00
 */
public interface ICargoRoutingService {
    MultiResponse<VoyageDTO> cargoRoute(CargoRoutingCmd cmd);
}
