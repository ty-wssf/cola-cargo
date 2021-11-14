package com.rickie.convertor;

import com.rickie.domain.model.aggregates.Voyage;
import com.rickie.routing.VoyageDO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName VoyageConvertor.java
 * @Description TODO
 * @createTime 2021年07月10日 17:30:00
 */
public class VoyageConvertor {
    public static Voyage toDomainObject(VoyageDO voyageDO) {
        if(voyageDO == null) {
            return null;
        }
        Voyage voyage = new Voyage();
        voyage.setId(voyageDO.getId());
        voyage.setVoyageNumber(voyageDO.getVoyageNumber());
        voyage.setCarrierMovements(CarrierMovementConvertor.toDomainObject(voyageDO.getCarrierMovements()));
        return voyage;
    }

    public static List<Voyage> toDomainObject(List<VoyageDO> voyageDOs) {
        List<Voyage> voyages = new ArrayList<>();
        for(VoyageDO voyageDO:voyageDOs) {
            voyages.add(VoyageConvertor.toDomainObject(voyageDO));
        }
        return voyages;
    }
}
