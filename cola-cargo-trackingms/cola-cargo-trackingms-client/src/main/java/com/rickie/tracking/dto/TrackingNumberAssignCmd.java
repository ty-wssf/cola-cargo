package com.rickie.tracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 分配TrackingNumber命令
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingNumberAssignCmd.java
 * @Description TODO
 * @createTime 2021年07月17日 23:18:00
 */
@Data
@AllArgsConstructor
public class TrackingNumberAssignCmd {
    private String bookingId;
    private String trackingNumber;
}

