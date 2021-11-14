package com.rickie.routing;

import com.rickie.convertor.VoyageConvertor;
import com.rickie.domain.model.gateway.CargoRoutingGateway;
import com.rickie.domain.model.aggregates.Voyage;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingGatewayImpl.java
 * @Description TODO
 * @createTime 2021年07月09日 14:58:00
 */
@Component
public class CargoRoutingGatewayImpl implements CargoRoutingGateway {
    @Resource
    private VoyageMapper voyageMapper;

    @Override
    public List<Voyage> findAll() {
        List<VoyageDO> voyageDOs = voyageMapper.findAll();
        if(voyageDOs != null && voyageDOs.size() > 0) {
            return VoyageConvertor.toDomainObject(voyageDOs);
        }
        return null;
    }
}
