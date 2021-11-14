package com.rickie.handling.serviceimpl;

import com.alibaba.cola.dto.Response;
import com.rickie.handling.api.ICargoHandlingService;
import com.rickie.handling.dto.HandlingActivityRegisterCmd;
import com.rickie.handling.executor.HandlingActivityRegisterCmdExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoHandlingService.java
 * @Description TODO
 * @createTime 2021年07月25日 21:46:00
 */
@Service
public class CargoHandlingServiceImpl implements ICargoHandlingService {
    @Autowired
    private HandlingActivityRegisterCmdExe handlingActivityRegisterCmdExe;

    public Response registerHandlingActivity(HandlingActivityRegisterCmd cmd){
        return handlingActivityRegisterCmdExe.execute(cmd);
    }
}
