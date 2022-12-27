package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.*;
import pl.dmuszynski.deliverycompany.data.Packet;

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

    private final Random random = new Random();

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

        for(int i = 0; i < deliveryQuantity; ++i)
            deliveryList.add(Delivery.builder()
                    .id(i)
                    .packet(packetList.get(random.nextInt(packetList.size())))
                    .promotion(promotionList.get(random.nextInt(promotionList.size())))
                    .time(timeList.get(random.nextInt(timeList.size())))
                    .receiver(receiverList.get(random.nextInt(receiverList.size())))
                    .sender(senderList.get(random.nextInt(senderList.size())))
                    .supplier(supplierList.get(random.nextInt(supplierList.size())))
                    .warehouse(warehouseList.get(random.nextInt(warehouseList.size())))
                    .pickupPoint(pickupPointList.get(random.nextInt(pickupPointList.size())))
                    .courier(courierList.get(random.nextInt(courierList.size())))
                    .vehicle(vehicleList.get(random.nextInt(vehicleList.size())))
                    .totalCost(random.nextFloat(10000, 100000))
                    .totalProfit(random.nextFloat(10000, 150000))
                    .packetAmount(random.nextInt(1000, 5000))
                    .clientAmount(random.nextInt(1000, 3000))
                    .employeeAmount(random.nextInt(20, 100))
                    .build());

        return deliveryList;
    }
}

