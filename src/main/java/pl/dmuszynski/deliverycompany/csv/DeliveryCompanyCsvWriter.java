package pl.dmuszynski.deliverycompany.csv;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.dmuszynski.deliverycompany.csv.datamapper.ObjectCsvFormatMapper;
import pl.dmuszynski.deliverycompany.data.Delivery;
import pl.dmuszynski.deliverycompany.generator.DeliveryGenerator;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
public final class DeliveryCompanyCsvWriter {
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
                .generateRandomDeliveryList(5, 1,
                        4,1,1,1,1,1,1);

        ObjectCsvFormatMapper<Delivery> timeCsvFormatMapper = new ObjectCsvFormatMapper<>();
        OpenCsvWriter.writeDataToDefaultFolder(timeCsvFormatMapper.createCsvData(deliveryList, Delivery.class), "time.csv");
    }
}
