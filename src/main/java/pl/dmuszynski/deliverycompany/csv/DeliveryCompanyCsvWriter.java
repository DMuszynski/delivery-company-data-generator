package pl.dmuszynski.deliverycompany.csv;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import pl.dmuszynski.deliverycompany.csv.datamapper.ObjectCsvFormatMapper;
import pl.dmuszynski.deliverycompany.data.Delivery;
import pl.dmuszynski.deliverycompany.data.Packet;
import pl.dmuszynski.deliverycompany.generator.DeliveryGenerator;
import pl.dmuszynski.deliverycompany.mapper.PacketDTOMapper;
import pl.dmuszynski.deliverycompany.payload.PacketDTO;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Builder
@NoArgsConstructor
public final class DeliveryCompanyCsvWriter<E, DTO, M> {
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

        final Stream<Delivery> deliveryStream = deliveryList.stream();
        writePacketDataToCsv(deliveryStream.map(Delivery::getPacket).collect(Collectors.toSet()));
    }

    private void writePacketDataToCsv(Set<Packet> packetList) {
        List<PacketDTO> packetDTOList = packetList
                .stream()
                .map(PacketDTOMapper.INSTANCE::mapToPacketDTO)
                .sorted(Comparator.comparing(PacketDTO::getIdPacket))
                .toList();

        ObjectCsvFormatMapper<PacketDTO> packetCsvFormatMapper = new ObjectCsvFormatMapper<>();
        final List<String[]> packetDataString = packetCsvFormatMapper.createCsvData(packetDTOList, PacketDTO.class);
        OpenCsvWriter.writeDataToDefaultFolder(packetDataString, "packet.csv");
    }


//    private void writeDataToCsv(Set<E> dataObjectSet, Class<DTO> dtoClass, String filename) {
//        Delivery d =  Delivery.builder().id(2).clientAmount(1).build();
//        List<DTO> objectDTOList = dataObjectSet
//                .stream()
//                .map(M.INSTANCE::mapToDTO)
//                .sorted(Comparator.comparing(PacketDTO::getIdPacket))
//                .toList();
//
//        ObjectCsvFormatMapper<DTO> objectCsvFormatMapper = new ObjectCsvFormatMapper<>();
//        final List<String[]> objectDataString = objectCsvFormatMapper.createCsvData(objectDTOList, dtoClass);
//        OpenCsvWriter.writeDataToDefaultFolder(objectDataString, filename);
//    }
}
