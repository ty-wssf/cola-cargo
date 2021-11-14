package com.rickie.convertor;

import com.rickie.domain.model.valueobjects.CarrierMovement;
import com.rickie.routing.CarrierMovementDO;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CarrierMovementConvertor.java
 * @Description TODO
 * @createTime 2021年07月10日 17:37:00
 */
public class CarrierMovementConvertor {
    public static CarrierMovement toDomainObject(CarrierMovementDO carrierMovementDO){
        CarrierMovement carrierMovement = new CarrierMovement();
        BeanUtils.copyProperties(carrierMovementDO, carrierMovement);
        return carrierMovement;
    }

    public static List<CarrierMovement> toDomainObject(List<CarrierMovementDO> carrierMovementDOs) {
        List<CarrierMovement> carrierMovements = new ArrayList<>();
        for(CarrierMovementDO carrierMovementDO:carrierMovementDOs) {
            carrierMovements.add(CarrierMovementConvertor.toDomainObject(carrierMovementDO));
        }
        return carrierMovements;
    }
}
