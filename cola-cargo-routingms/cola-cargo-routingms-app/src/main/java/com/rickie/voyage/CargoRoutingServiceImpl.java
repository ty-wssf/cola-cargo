package com.rickie.voyage;

import com.alibaba.cola.dto.MultiResponse;
import com.rickie.api.ICargoRoutingService;
import com.rickie.dto.CargoRoutingCmd;
import com.rickie.dto.data.VoyageDTO;
import com.rickie.voyage.executor.CargoRoutingCmdExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingServiceImpl.java
 * @Description TODO
 * @createTime 2021年07月08日 21:02:00
 */
@Service
public class CargoRoutingServiceImpl implements ICargoRoutingService {
    @Autowired
    private CargoRoutingCmdExe cargoRoutingCmdExe;

    @Override
    public MultiResponse<VoyageDTO> cargoRoute(CargoRoutingCmd cmd) {
        return cargoRoutingCmdExe.execute(cmd);
    }
}
