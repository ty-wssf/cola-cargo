package com.rickie.convertor;

import com.alibaba.cola.exception.BizException;
import com.rickie.dbsdk.model.CargoDO;
import com.rickie.domain.model.aggregates.BookingId;
import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.valueobjects.CargoItinerary;
import com.rickie.domain.model.valueobjects.Delivery;
import com.rickie.domain.model.valueobjects.LastCargoHandledEvent;
import com.rickie.domain.model.valueobjects.RouteSpecification;
import com.rickie.dto.data.ErrorCode;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoConvertor.java
 * @Description TODO
 * @createTime 2021年06月15日 22:54:00
 */
public class CargoConvertor {
    public static CargoDO toDataObject(Cargo cargo) {
        if(cargo == null || cargo.getRouteSpecification() == null) {
            throw new BizException(ErrorCode.CARGO_BOOKING_REQUEST_ERROR.getErrCode(), "包裹预订请求参数错误");
        }
        CargoDO cargoDO = new CargoDO();
        if(cargo.getId() != null) {
            // 新增记录时没有值，更新时有值
            cargoDO.setId(cargo.getId().intValue());
        }
        cargoDO.setBookingId(cargo.getBookingId().getBookingId());
        cargoDO.setBookingAmount(cargo.getBookingAmount());
        cargoDO.setTransportStatus(cargo.getDelivery().getTransportStatus().name());
        cargoDO.setRoutingStatus(cargo.getDelivery().getRoutingStatus().name());
        cargoDO.setSpecOriginId(cargo.getRouteSpecification().getOrigin());
        cargoDO.setSpecDestinationId(cargo.getRouteSpecification().getDestination());
        cargoDO.setSpecArrivalDeadline(cargo.getRouteSpecification().getArrivalDeadline());
        return cargoDO;
    }

    public static Cargo toDomainObject(CargoDO cargoDO) {
        if(cargoDO == null) {
           return null;
        }
        Cargo cargo = new Cargo();
        cargo.setId(cargoDO.getId().longValue());
        cargo.setBookingId(new BookingId(cargoDO.getBookingId()));
        cargo.setBookingAmount(cargoDO.getBookingAmount());
        LastCargoHandledEvent lastCargoHandledEvent = new LastCargoHandledEvent(
                cargoDO.getBookingId(),
                cargoDO.getHandlingEventId(),
                cargoDO.getLastHandlingEventType(),
                cargoDO.getLastHandlingEventVoyage(),
                cargoDO.getLastHandlingEventLocation());
        CargoItinerary cargoItinerary = new CargoItinerary();
        cargo.setItinerary(cargoItinerary);
        RouteSpecification routeSpecification = new RouteSpecification(
                cargoDO.getSpecOriginId(),
                cargoDO.getSpecDestinationId(),
                cargoDO.getSpecArrivalDeadline()
        );
        cargo.setRouteSpecification(routeSpecification);
        cargo.setDelivery(new Delivery(lastCargoHandledEvent, cargoItinerary, routeSpecification));
        return cargo;
    }
}
