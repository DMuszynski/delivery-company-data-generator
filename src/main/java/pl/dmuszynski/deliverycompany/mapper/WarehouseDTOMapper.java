package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Time;
import pl.dmuszynski.deliverycompany.data.Warehouse;
import pl.dmuszynski.deliverycompany.mapper.annotation.AddressMapping;
import pl.dmuszynski.deliverycompany.payload.TimeDTO;
import pl.dmuszynski.deliverycompany.payload.WarehouseDTO;

@Mapper
public interface WarehouseDTOMapper extends DataDTOMapper<Warehouse, WarehouseDTO> {
    WarehouseDTOMapper INSTANCE = Mappers.getMapper(WarehouseDTOMapper.class);

    @AddressMapping
    WarehouseDTO mapToDTO(Warehouse warehouse);
}
