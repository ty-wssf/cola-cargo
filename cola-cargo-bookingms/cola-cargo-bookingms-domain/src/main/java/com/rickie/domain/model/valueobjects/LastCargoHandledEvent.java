package com.rickie.domain.model.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName LastCargoHandledEvent.java
 * @Description 货物最后一次的处理事件
 * @createTime 2021年06月13日 17:03:00
 */
@Data
@AllArgsConstructor
public class LastCargoHandledEvent {
    private String bookingId;
    private Integer handlingEventId;
    private String handlingEventType;
    private String handlingEventVoyage;
    private String handlingEventLocation;
    // Null object pattern.
    public static final LastCargoHandledEvent EMPTY = new LastCargoHandledEvent();

    public LastCargoHandledEvent() {
    }
}
