package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Warehouse;
import pl.dmuszynski.deliverycompany.mapper.annotation.AddressMapping;
import pl.dmuszynski.deliverycompany.payload.WarehouseDTO;

@Mapper
public interface WarehouseDTOMapper {
    WarehouseDTOMapper INSTANCE = Mappers.getMapper(WarehouseDTOMapper.class);

    @AddressMapping
    WarehouseDTO mapToWarehouseDTO(Warehouse warehouse);
}
