package com.rickie.tracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * 新增跟踪事件命令
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingEventAddCmd.java
 * @Description TODO
 * @createTime 2021年07月17日 23:20:00
 */
@Data
@AllArgsConstructor
public class TrackingEventAddCmd {
    private String bookingId;
    private Date eventTime;
    private String eventType;
    private String location;
    private String voyageNumber;
}
