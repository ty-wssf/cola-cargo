package com.rickie.handling.api;

import com.alibaba.cola.dto.Response;
import com.rickie.handling.dto.HandlingActivityRegisterCmd;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName ICargoHandlingService.java
 * @Description TODO
 * @createTime 2021年07月25日 21:50:00
 */
public interface ICargoHandlingService {
    Response registerHandlingActivity(HandlingActivityRegisterCmd cmd);
}
