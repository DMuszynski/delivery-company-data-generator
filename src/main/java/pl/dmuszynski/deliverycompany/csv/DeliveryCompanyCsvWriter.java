package pl.dmuszynski.deliverycompany.csv;

import lombok.Getter;
import lombok.NoArgsConstructor;

import pl.dmuszynski.deliverycompany.data.*;
import pl.dmuszynski.deliverycompany.generator.DeliveryGenerator;
import pl.dmuszynski.deliverycompany.mapper.PacketDTOMapper;
import pl.dmuszynski.deliverycompany.mapper.ReceiverDTOMapper;
import pl.dmuszynski.deliverycompany.mapper.SenderDTOMapper;
import pl.dmuszynski.deliverycompany.mapper.TimeDTOMapper;
import pl.dmuszynski.deliverycompany.payload.PacketDTO;
import pl.dmuszynski.deliverycompany.payload.ReceiverDTO;
import pl.dmuszynski.deliverycompany.payload.SenderDTO;
import pl.dmuszynski.deliverycompany.payload.TimeDTO;

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
}
