package pl.dmuszynski.deliverycompany;

import pl.dmuszynski.deliverycompany.csv.OpenCsvWriter;
import pl.dmuszynski.deliverycompany.csv.datamapper.ObjectCsvFormatMapper;
import pl.dmuszynski.deliverycompany.data.Delivery;
import pl.dmuszynski.deliverycompany.data.Time;
import pl.dmuszynski.deliverycompany.generator.DeliveryGenerator;
import pl.dmuszynski.deliverycompany.generator.TimeGenerator;

import java.util.Arrays;
import java.util.List;

public class DeliveryCompanyDataGeneratorApp {
    public static void main( String[] args ) {
        DeliveryGenerator deliveryGenerator = new DeliveryGenerator();
        List<Delivery> deliveryList = deliveryGenerator
                .generateRandomDeliveryList(5, 1,
                4,1,1,1,1,1,1);

        System.out.println(deliveryList.get(0).toString());
        System.out.println(deliveryList.get(1).toString());

        TimeGenerator timeGenerator = new TimeGenerator();
        List<Time> timeList = timeGenerator.getRandomTimeList(5);

        ObjectCsvFormatMapper<Time> timeCsvFormatMapper = new ObjectCsvFormatMapper<>();
        OpenCsvWriter.writeDataToDefaultFolder(timeCsvFormatMapper.createCsvData(timeList, Time.class), "time.csv");
    }
}
