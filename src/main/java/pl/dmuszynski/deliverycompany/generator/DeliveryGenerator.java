package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeliveryGenerator {
    private final PacketGenerator packetGenerator = new PacketGenerator();
    private final PromotionGenerator promotionGenerator = new PromotionGenerator();
    private final TimeGenerator timeGenerator = new TimeGenerator();
    private final ReceiverGenerator receiverGenerator = new ReceiverGenerator();
    private final SenderGenerator senderGenerator = new SenderGenerator();
    private final SupplierGenerator supplierGenerator = new SupplierGenerator();
    private final WarehouseGenerator warehouseGenerator = new WarehouseGenerator();
    private final PickupPointGenerator pickupPointGenerator = new PickupPointGenerator();
    private final CourierGenerator courierGenerator = new CourierGenerator();
    private final VehicleGenerator vehicleGenerator = new VehicleGenerator();
    private final Random rand = new Random();

    public List<Delivery> generateRandomDeliveryList
            (int deliveryQuantity, int packetQuantity, int timeQuantity, int receiverQuantity,
             int senderQuantity, int warehouseQuantity, int pickupPointQuantity,
             int courierQuantity, int vehicleQuantity) {

        final List<Delivery> deliveryList = new ArrayList<>(deliveryQuantity);
        final List<Packet> packetList = this.packetGenerator.getRandomPacketList(packetQuantity);
        final List<Promotion> promotionList = this.promotionGenerator.getRandomPromotionList();
        final List<Time> timeList = this.timeGenerator.getRandomTimeList(timeQuantity);
        final List<Receiver> receiverList = this.receiverGenerator.getRandomReceiverList(receiverQuantity);
        final List<Sender> senderList = this.senderGenerator.getRandomSenderList(senderQuantity);
        final List<Supplier> supplierList = this.supplierGenerator.getSupplierList();
        final List<Warehouse> warehouseList = this.warehouseGenerator.getRandomWarehouseList(warehouseQuantity);
        final List<PickupPoint> pickupPointList = this.pickupPointGenerator.getRandomPickupPointList(pickupPointQuantity);
        final List<Courier> courierList = this.courierGenerator.getRandomCourierList(courierQuantity);
        final List<Vehicle> vehicleList = this.vehicleGenerator.getRandomVehicleList(vehicleQuantity);

        for(int i = 0; i < deliveryQuantity; ++i) {
            final Packet packet = packetList.get(rand.nextInt(packetList.size()));
            final Promotion promotion = promotionList.get(rand.nextInt(promotionList.size()));
            final Time time = timeList.get(rand.nextInt(timeList.size()));
            final Receiver receiver = receiverList.get(rand.nextInt(receiverList.size()));
            final Sender sender = senderList.get(rand.nextInt(senderList.size()));
            final Supplier supplier = supplierList.get(rand.nextInt(supplierList.size()));
            final Warehouse warehouse = warehouseList.get(rand.nextInt(warehouseList.size()));
            final PickupPoint pickupPoint = pickupPointList.get(rand.nextInt(pickupPointList.size()));
            final Courier courier = courierList.get(rand.nextInt(courierList.size()));
            final Vehicle vehicle = vehicleList.get(rand.nextInt(vehicleList.size()));
            deliveryList.add(new Delivery(i, packet,promotion,time, receiver, sender, supplier,
                    warehouse, pickupPoint, courier, vehicle));
        }
        return deliveryList;
    }
}

