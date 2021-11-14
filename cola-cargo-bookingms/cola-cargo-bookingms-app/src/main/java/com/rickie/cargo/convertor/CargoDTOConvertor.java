package com.rickie.cargo.convertor;

import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.valueobjects.LastCargoHandledEvent;
import com.rickie.dto.HandlingActivityUpdateCmd;
import com.rickie.dto.data.CargoDTO;
import com.rickie.handling.dto.event.CargoHandledEvent;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoDTOConvertor.java
 * @Description TODO
 * @createTime 2021年06月19日 22:32:00
 */
public class CargoDTOConvertor {
    public static CargoDTO toDTO(Cargo cargo) {
        if(cargo == null) {
            return null;
        }

        CargoDTO cargoDTO = new CargoDTO();
        cargoDTO.setBookingAmount(cargo.getBookingAmount());
        cargoDTO.setOriginLocation(cargo.getRouteSpecification().getOrigin());
        cargoDTO.setDestLocation(cargo.getRouteSpecification().getDestination());
        cargoDTO.setDestArrivalDeadline(cargo.getRouteSpecification().getArrivalDeadline());
        return cargoDTO;
    }

    public static LastCargoHandledEvent toLastCargoHandledEvent(HandlingActivityUpdateCmd cmd) {
        LastCargoHandledEvent lastCargoHandledEvent = new LastCargoHandledEvent();
        lastCargoHandledEvent.setBookingId(cmd.getBookingId());
        lastCargoHandledEvent.setHandlingEventLocation(cmd.getHandlingLocation());
        lastCargoHandledEvent.setHandlingEventType(cmd.getEventType());
        lastCargoHandledEvent.setHandlingEventVoyage(cmd.getVoyageNumber());
        return lastCargoHandledEvent;
    }

    public static HandlingActivityUpdateCmd toHandlingActivityUpdateCmd(CargoHandledEvent event){
        HandlingActivityUpdateCmd cmd = new HandlingActivityUpdateCmd(
                event.getBookingId(), event.getEventType(), event.getHandlingCompletionTime(),
                event.getHandlingLocation(),event.getVoyageNumber()
        );
        return cmd;
    }
}
