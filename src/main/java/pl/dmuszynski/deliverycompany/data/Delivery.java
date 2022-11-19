package pl.dmuszynski.deliverycompany.data;

public class Delivery {
    private final long idDelivery;
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

    private int packetAmount;
    private float deliveryCost;
    private float totalCost;
    private float deliveryTime;

    public Delivery(long idDelivery, Packet packet, Promotion promotion, Time time, Receiver receiver, Sender sender,
                    Supplier supplier, Warehouse warehouse, PickupPoint pickupPoint, Courier courier,
                    Vehicle vehicle) {
        this.idDelivery = idDelivery;
        this.packet = packet;
        this.promotion = promotion;
        this.time = time;
        this.receiver = receiver;
        this.sender = sender;
        this.supplier = supplier;
        this.warehouse = warehouse;
        this.pickupPoint = pickupPoint;
        this.courier = courier;
        this.vehicle = vehicle;
    }

    public long getIdDelivery() {
        return idDelivery;
    }

    public Packet getPacket() {
        return packet;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public Time getTime() {
        return time;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Sender getSender() {
        return sender;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public PickupPoint getPickupPoint() {
        return pickupPoint;
    }

    public Courier getCourier() {
        return courier;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getPacketAmount() {
        return packetAmount;
    }

    public float getDeliveryCost() {
        return deliveryCost;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public float getDeliveryTime() {
        return deliveryTime;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "idDelivery=" + idDelivery +
                ", packet=" + packet +
                ", promotion=" + promotion +
                ", time=" + time +
                ", receiver=" + receiver +
                ", sender=" + sender +
                ", supplier=" + supplier +
                ", warehouse=" + warehouse +
                ", pickupPoint=" + pickupPoint +
                ", courier=" + courier +
                ", vehicle=" + vehicle +
                ", packetAmount=" + packetAmount +
                ", deliveryCost=" + deliveryCost +
                ", totalCost=" + totalCost +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
