package com.rickie.domain.model.gateway;

import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.valueobjects.LastCargoHandledEvent;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoGateway.java
 * @Description 对外依赖的网关接口，包括存储、RPC、Search等，可以认为是对infrastructure的依赖反转
 * @createTime 2021年06月14日 00:48:00
 */
public interface CargoBookingGateway {
    // 保存包裹预定信息
    public void save(Cargo cargo);

    public void update(Cargo cargo);

    public void updateRoutingStatus(Cargo cargo);

    public Cargo getByBookingId(String bookingId);

    public void updateByLastCargoHandledEvent(LastCargoHandledEvent event);
}

