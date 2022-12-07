package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Packet;
import pl.dmuszynski.deliverycompany.payload.PacketDTO;

@Mapper
public interface PacketDTOMapper {
    PacketDTOMapper INSTANCE = Mappers.getMapper(PacketDTOMapper.class);

    @Mappings({
            @Mapping(source = "dimension.length", target = "length"),
            @Mapping(source = "dimension.width", target = "width"),
            @Mapping(source = "dimension.height", target = "height")})
    PacketDTO mapToPacketDTO(Packet packet);
}
