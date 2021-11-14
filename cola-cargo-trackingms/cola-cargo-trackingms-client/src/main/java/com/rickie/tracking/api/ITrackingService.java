package com.rickie.tracking.api;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.rickie.tracking.dto.TrackingEventAddCmd;
import com.rickie.tracking.dto.TrackingNumberAssignCmd;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName ITrackingService.java
 * @Description TODO
 * @createTime 2021年07月22日 16:43:00
 */
public interface ITrackingService {
    SingleResponse<String> assignTrackingNumberToCargo(TrackingNumberAssignCmd cmd);
    Response addTrackingEvent(TrackingEventAddCmd cmd);
}
