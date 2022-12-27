package pl.dmuszynski.deliverycompany.csv;

import lombok.Getter;
import lombok.NoArgsConstructor;

import pl.dmuszynski.deliverycompany.data.*;
import pl.dmuszynski.deliverycompany.generator.DeliveryGenerator;
import pl.dmuszynski.deliverycompany.mapper.*;
import pl.dmuszynski.deliverycompany.payload.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public final class DeliveryCompanyCsvWriter{

    private final int deliveryQuantity = 1000;
    private final int packetQuantity = 100;
    private final int timeQuantity = 100;
    private final int receiverQuantity = 100;
    private final int senderQuantity = 100;
    private final int warehouseQuantity = 100;
    private final int pickupPointQuantity = 100;
    private final int courierQuantity = 100;
    private final int vehicleQuantity = 100;

    private final DeliveryGenerator deliveryGenerator = new DeliveryGenerator();

    public void writeDeliveryCompanyToCsv() {
        List<Delivery> deliveryList = deliveryGenerator
                .generateRandomDeliveryList(deliveryQuantity, packetQuantity, timeQuantity, receiverQuantity,
                        senderQuantity, warehouseQuantity, pickupPointQuantity, courierQuantity, vehicleQuantity);

        writePacketDataToCsv(deliveryList);
        writeTimeDataToCsv(deliveryList);
        writeReceiverDataToCsv(deliveryList);
        writeSenderDataToCsv(deliveryList);
        writeWarehouseDataToCsv(deliveryList);
        writePickupPointDataToCsv(deliveryList);
    }

    private void writePacketDataToCsv(List<Delivery> deliveryList) {
        final Set<Packet> packetSet = deliveryList.stream().map(Delivery::getPacket).collect(Collectors.toSet());
        final DataCsvWriter<Packet, PacketDTO> packetDTOWriter = new DataCsvWriter<>();
        packetDTOWriter.writeDataToCsv(packetSet, PacketDTOMapper.INSTANCE, "packet.csv", PacketDTO.class);
    }

    private void writeTimeDataToCsv(List<Delivery> deliveryList) {
        final Set<Time> timeSet = deliveryList.stream().map(Delivery::getTime).collect(Collectors.toSet());
        final DataCsvWriter<Time, TimeDTO> timeDTOWriter = new DataCsvWriter<>();
        timeDTOWriter.writeDataToCsv(timeSet, TimeDTOMapper.INSTANCE, "time.csv", TimeDTO.class);
    }

    private void writeReceiverDataToCsv(List<Delivery> deliveryList) {
        final Set<Receiver> receiverSet = deliveryList.stream().map(Delivery::getReceiver).collect(Collectors.toSet());
        final DataCsvWriter<Receiver, ReceiverDTO> receiverDTOWriter = new DataCsvWriter<>();
        receiverDTOWriter.writeDataToCsv(receiverSet, ReceiverDTOMapper.INSTANCE, "receiver.csv", ReceiverDTO.class);
    }

    private void writeSenderDataToCsv(List<Delivery> deliveryList) {
        final Set<Sender> senderSet = deliveryList.stream().map(Delivery::getSender).collect(Collectors.toSet());
        final DataCsvWriter<Sender, SenderDTO> senderDTOWriter = new DataCsvWriter<>();
        senderDTOWriter.writeDataToCsv(senderSet, SenderDTOMapper.INSTANCE, "sender.csv", SenderDTO.class);
    }

    private void writeWarehouseDataToCsv(List<Delivery> deliveryList) {
        final Set<Warehouse> warehouseSet = deliveryList.stream().map(Delivery::getWarehouse).collect(Collectors.toSet());
        final DataCsvWriter<Warehouse, WarehouseDTO> warehouseDTOWriter = new DataCsvWriter<>();
        warehouseDTOWriter.writeDataToCsv(warehouseSet, WarehouseDTOMapper.INSTANCE, "warehouse.csv", WarehouseDTO.class);
    }

    private void writePickupPointDataToCsv(List<Delivery> deliveryList) {
        final Set<PickupPoint> pickupPointSet = deliveryList.stream().map(Delivery::getPickupPoint).collect(Collectors.toSet());
        final DataCsvWriter<PickupPoint, PickupPointDTO> pickupPointDTOWriter = new DataCsvWriter<>();
        pickupPointDTOWriter.writeDataToCsv(pickupPointSet, PickupPointDTOMapper.INSTANCE, "pickupPoint.csv", PickupPointDTO.class);
    }
}
