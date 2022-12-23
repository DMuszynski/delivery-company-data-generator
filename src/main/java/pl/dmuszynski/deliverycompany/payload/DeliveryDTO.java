package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@ToString
@Builder
@EqualsAndHashCode
public class DeliveryDTO implements Serializable {
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

    private final float totalCost;
    private final float totalProfit;
    private final int packetAmount;
    private final float clientAmount;
    private final float employeeAmount;
}
