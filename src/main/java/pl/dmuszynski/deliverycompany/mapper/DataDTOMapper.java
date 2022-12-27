package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.factory.Mappers;

public interface DataDTOMapper<D, DTO> {
    Object INSTANCE = Mappers.getMapper(DataDTOMapper.class);

    DTO mapToDTO(D dtoObject);
}
