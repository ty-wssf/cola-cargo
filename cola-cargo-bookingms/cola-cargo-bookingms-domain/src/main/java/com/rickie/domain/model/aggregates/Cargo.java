package com.rickie.domain.model.aggregates;

import com.rickie.domain.model.valueobjects.*;
import com.rickie.dto.CargoBookCmd;
import lombok.Data;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName Cargo.java
 * @Description 包裹类
 * @createTime 2021年06月13日 16:19:00
 */
@Data
public class Cargo {
    private Long id;
    // 预定号
    private BookingId bookingId;
    private Integer bookingAmount;
    private String location;
    // route specification of the cargo
    // 货物路线说明
    private RouteSpecification routeSpecification;
    // itinerary assigned to the cargo
    // 分配给货物的行程
    private CargoItinerary itinerary;
    // Checks the delivery progress of the cargo against the actual Route Specification and Itinerary
    // 货物交付进度
    private Delivery delivery;

    /**
     * Default Constructor
     */
    public Cargo() {
        // Nothing to initialize.
    }

    public Cargo(CargoBookCmd cmd) {
        this.bookingId = new BookingId(cmd.getBookingId());
        this.bookingAmount = cmd.getBookingAmount();
        this.itinerary = CargoItinerary.EMPTY_ITINERARY;
        this.routeSpecification = new RouteSpecification(
                cmd.getOriginLocation(),
                cmd.getDestLocation(),
                cmd.getDestArrivalDeadline()
        );
        this.delivery = new Delivery(LastCargoHandledEvent.EMPTY, this.itinerary, this.routeSpecification);
    }

    /**
     * 分配包裹路线
     *
     * @param cargoItinerary
     */
    public void assignToRoute(CargoItinerary cargoItinerary) {
        this.itinerary = cargoItinerary;
        this.delivery.setRoutingStatus(RoutingStatus.ROUTED);
    }
}
