package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Courier;
import pl.dmuszynski.deliverycompany.mapper.annotation.PersonMapping;
import pl.dmuszynski.deliverycompany.payload.CourierDTO;

@Mapper
public interface CourierDTOMapper {
    CourierDTOMapper INSTANCE = Mappers.getMapper(CourierDTOMapper.class);

    @PersonMapping
    CourierDTO mapToCourierDTO(Courier courier);
}
