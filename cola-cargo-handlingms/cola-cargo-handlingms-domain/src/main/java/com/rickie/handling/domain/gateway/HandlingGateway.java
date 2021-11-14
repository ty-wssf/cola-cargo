package com.rickie.handling.domain.gateway;

import com.rickie.handling.domain.model.aggregates.HandlingActivity;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingGateway.java
 * @Description TODO
 * @createTime 2021年07月25日 23:49:00
 */
public interface HandlingGateway {
    void save(HandlingActivity handlingActivity);
}
