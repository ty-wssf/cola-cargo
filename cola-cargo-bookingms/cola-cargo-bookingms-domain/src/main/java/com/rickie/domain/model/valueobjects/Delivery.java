package com.rickie.domain.model.valueobjects;

import lombok.Data;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName Delivery.java
 * @Description TODO
 * @createTime 2021年06月13日 16:58:00
 */
@Data
public class Delivery {
    // 货物路由状态
    private RoutingStatus routingStatus;
    // 货物运输状态
    private TransportStatus transportStatus;
    // 最后位置
    private String lastKnownLocation;
    private String currentVoyateNumber;
    // 货物最后一次的处理事件
    private LastCargoHandledEvent lastEvent;

    public Delivery() {
        // Nothing to initialize
    }

    public Delivery(LastCargoHandledEvent lastEvent, CargoItinerary itinerary,
                    RouteSpecification routeSpecification) {
        this.lastEvent = lastEvent;

        this.routingStatus = calculateRoutingStatus(itinerary,
                routeSpecification);
        this.transportStatus = calculateTransportStatus();
        this.lastKnownLocation = calculateLastKnownLocation();
        this.currentVoyateNumber = calculateCurrentVoyage();
    }

    /**
     * Method to calculate the Routing status of a Cargo
     *
     * @param itinerary
     * @param routeSpecification
     * @return
     */
    private RoutingStatus calculateRoutingStatus(CargoItinerary itinerary,
                                                 RouteSpecification routeSpecification) {
        if (itinerary == null || itinerary == CargoItinerary.EMPTY_ITINERARY) {
            return RoutingStatus.NOT_ROUTED;
        } else {
            return RoutingStatus.ROUTED;
        }
    }

    /**
     * Method to calculate the Transposrt Status of a Cargo
     * @return
     */
    private TransportStatus calculateTransportStatus() {
        System.out.println("Transport Status for last event: "+lastEvent.getHandlingEventType());
        if (lastEvent.getHandlingEventType() == null) {
            return TransportStatus.NOT_RECEIVED;
        }

        switch (lastEvent.getHandlingEventType()) {
            case "LOAD":
                return TransportStatus.ONBOARD_CARRIER;
            case "UNLOAD":
            case "RECEIVE":
            case "CUSTOMS":
                return TransportStatus.IN_PORT;
            case "CLAIM":
                return TransportStatus.CLAIMED;
            default:
                return TransportStatus.UNKNOWN;
        }
    }

    /**
     * Calculate Last known location
     * @return
     */
    private String calculateLastKnownLocation() {
        if (lastEvent != null) {
            return lastEvent.getHandlingEventLocation();
        } else {
            return null;
        }
    }

    private String calculateCurrentVoyage() {
        if (getTransportStatus().equals(TransportStatus.ONBOARD_CARRIER) && lastEvent != null) {
            return lastEvent.getHandlingEventVoyage();
        } else {
            return null;
        }
    }
}
