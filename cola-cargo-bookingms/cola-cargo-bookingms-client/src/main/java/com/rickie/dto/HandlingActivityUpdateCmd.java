package com.rickie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingActivityUpdateCmd.java
 * @Description TODO
 * @createTime 2021年08月13日 14:37:00
 */
@Data
@AllArgsConstructor
public class HandlingActivityUpdateCmd {
    private String bookingId;
    private String eventType;
    private Date handlingCompletionTime;
    private String handlingLocation;
    private String voyageNumber;
}
