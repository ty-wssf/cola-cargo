package com.rickie.web;

import com.alibaba.cola.dto.MultiResponse;
import com.rickie.api.ICargoRoutingService;
import com.rickie.dto.CargoRoutingCmd;
import com.rickie.dto.data.VoyageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingController.java
 * @Description TODO
 * @createTime 2021年07月08日 15:29:00
 */
@RestController
@RequestMapping("/cargorouting")
public class CargoRoutingController {
    @Autowired
    private ICargoRoutingService cargoRoutingService;

    @PostMapping("/optimalRoute")
    public MultiResponse<VoyageDTO> findOptimalRoute(@RequestBody CargoRoutingCmd cmd) {
        System.out.println("包裹路由命令：" + cmd.toString());
        return cargoRoutingService.cargoRoute(cmd);
    }
}
