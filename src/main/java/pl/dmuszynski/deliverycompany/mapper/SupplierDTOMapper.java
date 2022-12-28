package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Supplier;
import pl.dmuszynski.deliverycompany.payload.SupplierDTO;

@Mapper
public interface SupplierDTOMapper extends DataDTOMapper<Supplier, SupplierDTO> {
    SupplierDTOMapper INSTANCE = Mappers.getMapper(SupplierDTOMapper.class);
}
