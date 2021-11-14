package com.rickie.web;

import com.alibaba.cola.dto.SingleResponse;
import com.rickie.api.ICargoBookingService;
import com.rickie.api.ICargoRoutingService;
import com.rickie.dto.CargoBookCmd;
import com.rickie.dto.data.CargoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoController.java
 * @Description TODO
 * @createTime 2021年06月14日 15:43:00
 */
@RestController
@RequestMapping("cargo")
public class CargoController {
    @Autowired
    private ICargoBookingService cargoBookingService;

    @Autowired
    private ICargoRoutingService cargoRoutingService;

    @GetMapping( "helloworld")
    public String helloWorld(){
        return "Hello, welcome to COLA world!";
    }

    @PostMapping("cargobooking")
    public SingleResponse<String> bookCargo(@RequestBody CargoBookCmd cmd){
        System.out.println("****Cargo Booked **** "+cmd.getBookingAmount());
        return cargoBookingService.bookCargo(cmd);
    }

    @GetMapping("findCargo")
    public SingleResponse<CargoDTO> findByBookingId(@RequestParam("bookingId") String bookingId) {
        return cargoBookingService.findByBookingId(bookingId);
    }

    @PostMapping("cargorouting")
    public SingleResponse<String> routeCargo(@RequestParam("bookingId") String bookingId){
        SingleResponse<String> response = cargoRoutingService.routeCargo(bookingId);
        return response;
    }
}
