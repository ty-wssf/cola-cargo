package com.rickie.handling.web;

import com.alibaba.cola.dto.SingleResponse;
import com.rickie.handling.api.ICargoHandlingService;
import com.rickie.handling.dto.HandlingActivityRegisterCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoHandlingController.java
 * @Description TODO
 * @createTime 2021年07月25日 21:40:00
 */
@RestController
@RequestMapping("cargohandling")
public class CargoHandlingController {
    @Autowired
    private ICargoHandlingService cargoHandlingService;

    @PostMapping
    public SingleResponse<String> registerHandlingActivity(@RequestBody HandlingActivityRegisterCmd cmd){
        System.out.println("装卸活动 预订号：" + cmd.getBookingId() +
                " 类型：" + cmd.getHandlingType());
        cargoHandlingService.registerHandlingActivity(cmd);
        return SingleResponse.of("Handling Activity Registered");
    }
}
