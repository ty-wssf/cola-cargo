package com.rickie.dto.event;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutedEvent.java
 * @Description TODO
 * @createTime 2021年07月14日 17:04:00
 */
@Data
@NoArgsConstructor
public final class CargoRoutedEvent extends DomainEvent {
    private String bookingId;

    public CargoRoutedEvent( String bookingId) {
        super();
        this.bookingId = bookingId;
    }
}
