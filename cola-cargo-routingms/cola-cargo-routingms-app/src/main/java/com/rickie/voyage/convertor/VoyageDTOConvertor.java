package com.rickie.voyage.convertor;

import com.rickie.convertor.VoyageConvertor;
import com.rickie.domain.model.aggregates.Voyage;
import com.rickie.dto.data.CarrierMovementDTO;
import com.rickie.dto.data.VoyageDTO;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName VoyageDTOConvertor.java
 * @Description TODO
 * @createTime 2021年07月10日 18:12:00
 */
public class VoyageDTOConvertor {
    public static VoyageDTO toDTO(Voyage voyage) {
        if(voyage == null) {
            return null;
        }
        VoyageDTO voyageDTO = new VoyageDTO();
        BeanUtils.copyProperties(voyage, voyageDTO);
        ListUtils<CarrierMovementDTO> utils = BeanUtils.instantiateClass(ListUtils.class);
        utils.copyList(voyage.getCarrierMovements(), voyageDTO.getCarrierMovements(), CarrierMovementDTO.class);
        return voyageDTO;
    }

    public static List<VoyageDTO> toDTO(List<Voyage> voyages) {
        List<VoyageDTO> voyageDTOs = new ArrayList<>();
        for(Voyage voyage:voyages) {
            voyageDTOs.add(VoyageDTOConvertor.toDTO(voyage));
        }
        return voyageDTOs;
    }
}
