package pl.dmuszynski.deliverycompany.data;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Delivery extends AbstractEntity {
    private final Packet packet;
    private Promotion promotion;
    private Time time;
    private Receiver receiver;
    private Sender sender;
    private Supplier supplier;
    private Warehouse warehouse;
    private PickupPoint pickupPoint;
    private Courier courier;
    private Vehicle vehicle;

    private float totalCost;
    private float totalProfit;
    private int packetAmount;
    private int clientAmount;
    private int employeeAmount;
}
