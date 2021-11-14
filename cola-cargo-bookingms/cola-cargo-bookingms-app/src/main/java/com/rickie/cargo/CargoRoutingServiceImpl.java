package com.rickie.cargo;

import com.alibaba.cola.dto.SingleResponse;
import com.rickie.api.ICargoRoutingService;
import com.rickie.cargo.executor.CargoRoutingCmdExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingServiceImpl.java
 * @Description TODO
 * @createTime 2021年07月11日 14:45:00
 */
@Service
public class CargoRoutingServiceImpl implements ICargoRoutingService {
    @Autowired
    private CargoRoutingCmdExe cargoRoutingCmdExe;

    @Override
    public SingleResponse<String> routeCargo(String bookingId) {
        return cargoRoutingCmdExe.execute(bookingId);
    }
}
