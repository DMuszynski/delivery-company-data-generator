package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Sender;
import pl.dmuszynski.deliverycompany.mapper.annotation.PersonMapping;
import pl.dmuszynski.deliverycompany.payload.SenderDTO;

@Mapper
public interface SenderDTOMapper {
    SenderDTOMapper INSTANCE = Mappers.getMapper(SenderDTOMapper.class);

    @PersonMapping
    SenderDTO mapToSenderDTO(Sender sender);
}
