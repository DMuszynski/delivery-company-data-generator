package pl.dmuszynski.deliverycompany.data;

import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Delivery extends AbstractEntity {
    private final Packet packet;
    private final Promotion promotion;
    private final Time time;
    private final Receiver receiver;
    private final Sender sender;
    private final Supplier supplier;
    private final Warehouse warehouse;
    private final PickupPoint pickupPoint;
    private final Courier courier;
    private final Vehicle vehicle;

    private final float totalCost;
    private final float totalProfit;
    private final int packetAmount;
    private final int clientAmount;
    private final int employeeAmount;
}
