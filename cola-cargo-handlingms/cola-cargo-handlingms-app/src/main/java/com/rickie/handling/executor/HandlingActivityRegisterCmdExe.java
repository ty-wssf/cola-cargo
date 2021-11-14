package com.rickie.handling.executor;

import com.alibaba.cola.dto.Response;
import com.rickie.handling.domain.gateway.HandlingGateway;
import com.rickie.handling.domain.model.aggregates.HandlingActivity;
import com.rickie.handling.domain.model.valueobjects.EventType;
import com.rickie.handling.dto.HandlingActivityRegisterCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingActivityRegisterCmdExe.java
 * @Description TODO
 * @createTime 2021年07月25日 21:53:00
 */
@Component
public class HandlingActivityRegisterCmdExe {
    @Autowired
    private HandlingGateway handlingGateway;

    public Response execute(HandlingActivityRegisterCmd cmd){
        System.out.println("装卸航程号：" + cmd.getVoyageNumber());
        HandlingActivity handlingActivity = new HandlingActivity(
                EventType.valueOf(cmd.getHandlingType()),cmd.getLocation(),cmd.getCompletionTime(), cmd.getBookingId()
        );
        if(!cmd.getVoyageNumber().equals("")) {
            handlingActivity.setVoyageNumber(cmd.getVoyageNumber());
        }
        handlingGateway.save(handlingActivity);

        return Response.buildSuccess();
    }
}
