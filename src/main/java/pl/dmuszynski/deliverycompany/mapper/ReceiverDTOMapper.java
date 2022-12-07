package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Receiver;
import pl.dmuszynski.deliverycompany.mapper.annotation.PersonMapping;
import pl.dmuszynski.deliverycompany.payload.ReceiverDTO;

@Mapper
public interface ReceiverDTOMapper {
    ReceiverDTOMapper INSTANCE = Mappers.getMapper(ReceiverDTOMapper.class);

    @PersonMapping
    ReceiverDTO mapToReceiverDTO(Receiver receiver);
}
