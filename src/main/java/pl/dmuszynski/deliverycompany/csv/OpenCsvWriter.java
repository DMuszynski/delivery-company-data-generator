package pl.dmuszynski.deliverycompany.csv;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCsvWriter {

    public static void writeDeliveryToCsv(String path, String filename) {
        List<String[]> csvData = new ArrayList<>();

        try (CSVWriter writer = new CSVWriter(new FileWriter(path + filename))) {
            writer.writeAll(csvData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
