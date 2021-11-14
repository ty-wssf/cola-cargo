package com.rickie.handling.dto.event;

import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoHandledEvent.java
 * @Description TODO
 * @createTime 2021年08月10日 15:05:00
 */
@Data
public class CargoHandledEvent {
    private String bookingId;
    private String eventType;
    private Date handlingCompletionTime;
    private String handlingLocation;
    private String voyageNumber;
}
