package com.rickie.domain.model.gateway;

import com.alibaba.cola.dto.SingleResponse;
import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.valueobjects.CargoItinerary;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingGateway.java
 * @Description TODO
 * @createTime 2021年07月11日 12:15:00
 */
public interface CargoRoutingGateway {
    SingleResponse<CargoItinerary> routeCargo(Cargo cargo);
}
