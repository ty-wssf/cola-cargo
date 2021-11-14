package com.rickie.dto.event;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoBookedEvent.java
 * @Description TODO
 * @createTime 2021年07月15日 18:12:00
 */
@Data
@NoArgsConstructor
public final class CargoBookedEvent extends DomainEvent {
    private String bookingId;

    public CargoBookedEvent(String bookingId){
        this.bookingId = bookingId;
    }
}
