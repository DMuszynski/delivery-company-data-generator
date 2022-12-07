package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Time;
import pl.dmuszynski.deliverycompany.payload.TimeDTO;

@Mapper
public interface TimeDTOMapper {
    TimeDTOMapper INSTANCE = Mappers.getMapper(TimeDTOMapper.class);

    TimeDTO mapToTimeDTO(Time time);
}
