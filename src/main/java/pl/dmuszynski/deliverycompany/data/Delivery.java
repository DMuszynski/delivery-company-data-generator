package pl.dmuszynski.deliverycompany.data;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Builder;

@Getter
@ToString
@EqualsAndHashCode
@Builder
public class Delivery {
    private long idDelivery;
    private Packet packet;
    private Promotion promotion;
    private Time time;
    private Receiver receiver;
    private Sender sender;
    private Supplier supplier;
    private Warehouse warehouse;
    private PickupPoint pickupPoint;
    private Courier courier;
    private Vehicle vehicle;

    private int packetAmount;
    private float deliveryCost;
    private float totalCost;
    private float deliveryTime;
}
