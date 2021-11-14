package com.rickie.routing;

import lombok.Data;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName VoyageDO.java
 * @Description TODO
 * @createTime 2021年07月09日 15:37:00
 */
@Data
public class VoyageDO {
    private Long id;
    private String voyageNumber;
    private List<CarrierMovementDO> carrierMovements;
}
