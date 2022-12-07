package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Vehicle;
import pl.dmuszynski.deliverycompany.payload.VehicleDTO;

@Mapper
public interface VehicleDTOMapper {
    VehicleDTOMapper INSTANCE = Mappers.getMapper(VehicleDTOMapper.class);

    VehicleDTO mapToVehicleDTO(Vehicle vehicle);
}
