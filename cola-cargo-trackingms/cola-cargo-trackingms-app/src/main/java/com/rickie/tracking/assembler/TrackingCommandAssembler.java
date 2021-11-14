package com.rickie.tracking.assembler;

import com.rickie.dto.event.CargoRoutedEvent;
import com.rickie.handling.dto.event.CargoHandledEvent;
import com.rickie.tracking.dto.TrackingEventAddCmd;
import com.rickie.tracking.dto.TrackingNumberAssignCmd;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingCommandAssembler.java
 * @Description TODO
 * @createTime 2021年07月22日 20:56:00
 */
public class TrackingCommandAssembler {
    public static TrackingNumberAssignCmd toCommandFromEvent(CargoRoutedEvent event){
        return new TrackingNumberAssignCmd(
                event.getBookingId(), ""
        );
    }

    public static TrackingEventAddCmd toCommandFromEvent(CargoHandledEvent event){
        return new TrackingEventAddCmd(
                event.getBookingId(),event.getHandlingCompletionTime(),
                event.getEventType().toString(), event.getHandlingLocation(),
                event.getVoyageNumber()
        );
    }
}
