package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Delivery;
import pl.dmuszynski.deliverycompany.payload.DeliveryDTO;

@Mapper
public interface DeliveryDTOMapper extends DataDTOMapper<Delivery, DeliveryDTO>{
    DeliveryDTOMapper INSTANCE = Mappers.getMapper(DeliveryDTOMapper.class);

    @Mappings({
            @Mapping(source = "packet.id", target = "idPacket"),
            @Mapping(source = "promotion.id", target = "idPromotion"),
            @Mapping(source = "time.id", target = "idTime"),
            @Mapping(source = "receiver.id", target = "idReceiver"),
            @Mapping(source = "sender.id", target = "idSender"),
            @Mapping(source = "supplier.id", target = "idSupplier"),
            @Mapping(source = "warehouse.id", target = "idWarehouse"),
            @Mapping(source = "pickupPoint.id", target = "idPickupPoint"),
            @Mapping(source = "courier.id", target = "idCourier"),
            @Mapping(source = "vehicle.id", target = "idVehicle")})
    DeliveryDTO mapToDTO(Delivery delivery);
}
