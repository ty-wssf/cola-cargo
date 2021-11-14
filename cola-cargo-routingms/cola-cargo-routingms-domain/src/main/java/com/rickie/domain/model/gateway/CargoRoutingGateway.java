package com.rickie.domain.model.gateway;

import com.rickie.domain.model.aggregates.Voyage;

import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingGateway.java
 * @Description TODO
 * @createTime 2021年07月10日 23:42:00
 */
public interface CargoRoutingGateway {
    List<Voyage> findAll();
}
