package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;
import lombok.Getter;

@Getter
@ToString
@Builder
@EqualsAndHashCode
public class DeliveryDTO {
    private final long idDelivery;
    private final long idPacket;
    private final long idPromotion;
    private final long idTime;
    private final long idReceiver;
    private final long idSender;
    private final long idSupplier;
    private final long idWarehouse;
    private final long idPickupPoint;
    private final long idCourier;
    private final long idVehicle;

    private final int packetAmount;
    private final float deliveryCost;
    private final float totalCost;
    private final float deliveryTime;
}
