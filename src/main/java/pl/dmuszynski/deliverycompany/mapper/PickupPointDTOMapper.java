package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.PickupPoint;
import pl.dmuszynski.deliverycompany.mapper.annotation.AddressMapping;
import pl.dmuszynski.deliverycompany.payload.PickupPointDTO;

@Mapper
public interface PickupPointDTOMapper extends DataDTOMapper<PickupPoint, PickupPointDTO> {
    PickupPointDTOMapper INSTANCE = Mappers.getMapper(PickupPointDTOMapper.class);

    @AddressMapping
    PickupPointDTO mapToDTO(PickupPoint pickupPoint);
}
