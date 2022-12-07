package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Promotion;
import pl.dmuszynski.deliverycompany.payload.PromotionDTO;

@Mapper
public interface PromotionDTOMapper {
    PromotionDTOMapper INSTANCE = Mappers.getMapper(PromotionDTOMapper.class);

    PromotionDTO mapToPromotionDTO(Promotion promotion);
}
