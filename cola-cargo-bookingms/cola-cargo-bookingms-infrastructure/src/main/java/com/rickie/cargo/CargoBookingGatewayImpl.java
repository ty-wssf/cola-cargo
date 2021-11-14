package com.rickie.cargo;

import com.rickie.convertor.CargoConvertor;
import com.rickie.dbsdk.dao.CargoDOMapper;
import com.rickie.dbsdk.model.CargoDO;
import com.rickie.dbsdk.model.CargoDOExample;
import com.rickie.domain.model.gateway.CargoBookingGateway;
import com.rickie.domain.model.aggregates.Cargo;
import com.rickie.domain.model.valueobjects.LastCargoHandledEvent;
import com.rickie.dto.event.CargoBookedEvent;
import com.rickie.dto.event.CargoRoutedEvent;
import com.rickie.dto.event.DomainEventConstant;
import com.rickie.event.DomainEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoBookingGatewayImpl.java
 * @Description 网关接口实现
 * @createTime 2021年06月14日 15:35:00
 */
@Component
public class CargoBookingGatewayImpl implements CargoBookingGateway {
    @Resource
    private CargoDOMapper cargoDOMapper;
    @Resource
    private DomainEventPublisher domainEventPublisher;

    @Override
    public void save(Cargo cargo) {
        CargoDO cargoDO = CargoConvertor.toDataObject(cargo);
        cargoDOMapper.insert(cargoDO);

        //发布 CargoBookedEvent 领域事件
        CargoBookedEvent cargoBookedEvent = new CargoBookedEvent(cargoDO.getBookingId());
        domainEventPublisher.publish(DomainEventConstant.CARGO_BOOKED_EVENT_TOPIC, cargoBookedEvent);
    }

    @Override
    public void update(Cargo cargo) {
        CargoDO cargoDO = CargoConvertor.toDataObject(cargo);
        cargoDOMapper.updateByPrimaryKey(cargoDO);
    }

    @Override
    public void updateRoutingStatus(Cargo cargo) {
        CargoDO cargoDO = CargoConvertor.toDataObject(cargo);
        cargoDOMapper.updateByPrimaryKey(cargoDO);

        //发布 CargoRoutedEvent 领域事件
        CargoRoutedEvent cargoRoutedEvent = new CargoRoutedEvent(cargo.getBookingId().getBookingId());
        domainEventPublisher.publish(DomainEventConstant.CARGO_ROUTED_EVENT_TOPIC, cargoRoutedEvent);
    }

    @Override
    public Cargo getByBookingId(String bookingId) {
        CargoDOExample cargoDOExample = new CargoDOExample();
        cargoDOExample.createCriteria().andBookingIdEqualTo(bookingId);
        List<CargoDO> lstCargo = cargoDOMapper.selectByExample(cargoDOExample);
        if (lstCargo != null && lstCargo.size() > 0) {
            return CargoConvertor.toDomainObject(lstCargo.get(0));
        }
        return null;
    }

    @Override
    public void updateByLastCargoHandledEvent(LastCargoHandledEvent event) {
        CargoDO cargoDO = new CargoDO();
        cargoDO.setLastHandlingEventLocation(event.getHandlingEventLocation());
        cargoDO.setLastHandlingEventType(event.getHandlingEventType());
        cargoDO.setLastHandlingEventVoyage(event.getHandlingEventVoyage());
        CargoDOExample cargoDOExample = new CargoDOExample();
        cargoDOExample.createCriteria().andBookingIdEqualTo(event.getBookingId());
        cargoDOMapper.updateByExampleSelective(cargoDO, cargoDOExample);
    }
}
