package pl.dmuszynski.deliverycompany.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import pl.dmuszynski.deliverycompany.data.Delivery;
import pl.dmuszynski.deliverycompany.payload.DeliveryDTO;

@Mapper
public interface DeliveryDTOMapper {
    DeliveryDTOMapper INSTANCE = Mappers.getMapper(DeliveryDTOMapper.class);

    @Mappings({
            @Mapping(source = "packet.idPacket", target = "idPacket"),
            @Mapping(source = "promotion.idPromotion", target = "idPromotion"),
            @Mapping(source = "time.idTime", target = "idTime"),
            @Mapping(source = "receiver.idReceiver", target = "idReceiver"),
            @Mapping(source = "sender.idSender", target = "idSender"),
            @Mapping(source = "supplier.idSupplier", target = "idSupplier"),
            @Mapping(source = "warehouse.idWarehouse", target = "idWarehouse"),
            @Mapping(source = "pickupPoint.idPickupPoint", target = "idPickupPoint"),
            @Mapping(source = "courier.idCourier", target = "idCourier"),
            @Mapping(source = "vehicle.idVehicle", target = "idVehicle")})
    DeliveryDTO mapToDeliveryDTO(Delivery delivery);
}
