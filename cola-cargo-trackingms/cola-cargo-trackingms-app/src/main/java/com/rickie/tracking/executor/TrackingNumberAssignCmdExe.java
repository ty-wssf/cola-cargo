package com.rickie.tracking.executor;

import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.cola.exception.BizException;
import com.rickie.tracking.domain.model.aggregates.TrackingActivity;
import com.rickie.tracking.domain.ability.ITrackingDomainService;
import com.rickie.tracking.dto.TrackingNumberAssignCmd;
import com.rickie.tracking.dto.data.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingNumberAssignCmdExe.java
 * @Description TODO
 * @createTime 2021年07月22日 18:42:00
 */
@Component
public class TrackingNumberAssignCmdExe {
    @Autowired
    private ITrackingDomainService trackingDomainService;

    public SingleResponse<String> execute(TrackingNumberAssignCmd cmd){
        // 参数验证
        if(cmd == null || StringUtils.isEmpty(cmd.getBookingId()) ){
            throw new BizException(ErrorCode.BOOKINGID_NOT_EXIST.getErrCode(), ErrorCode.BOOKINGID_NOT_EXIST.getErrDesc());
        }

        //调用领域服务
        TrackingActivity trackingActivity = new TrackingActivity(cmd);
        trackingDomainService.create(trackingActivity);
        return SingleResponse.of(trackingActivity.getTrackNumber());
    }
}
