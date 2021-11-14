package com.rickie.tracking.serviceimpl;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.rickie.tracking.api.ITrackingService;
import com.rickie.tracking.executor.TrackingEventAddCmdExe;
import com.rickie.tracking.executor.TrackingNumberAssignCmdExe;
import com.rickie.tracking.dto.TrackingEventAddCmd;
import com.rickie.tracking.dto.TrackingNumberAssignCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingService.java
 * @Description TODO
 * @createTime 2021年07月22日 18:38:00
 */
@Service
public class TrackingService implements ITrackingService {
    @Autowired
    private TrackingNumberAssignCmdExe trackingNumberAssignCmdExe;
    @Autowired
    private TrackingEventAddCmdExe trackingEventAddCmdExe;

    @Override
    public SingleResponse<String> assignTrackingNumberToCargo(TrackingNumberAssignCmd cmd) {
        SingleResponse<String> singleResponse = trackingNumberAssignCmdExe.execute(cmd);
        System.out.println("Tracking Number: " + singleResponse.getData());
        return singleResponse;
    }

    @Override
    public Response addTrackingEvent(TrackingEventAddCmd cmd) {
        return trackingEventAddCmdExe.execute(cmd);
    }
}
