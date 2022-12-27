package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Packet;
import pl.dmuszynski.deliverycompany.payload.PacketDTO;

@Mapper
public interface PacketDTOMapper extends DataDTOMapper<Packet, PacketDTO> {
    PacketDTOMapper INSTANCE = Mappers.getMapper(PacketDTOMapper.class);
}
