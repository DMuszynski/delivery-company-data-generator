package pl.dmuszynski.deliverycompany.csv;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class OpenCsvWriter {

    private static final String PROJECT_DIR = System.getProperty("user.dir");
    private static final String CSV_FOLDER_DIR = PROJECT_DIR + "\\src\\main\\resources\\csv\\";

    public static void writeDataToDefaultFolder(List<String[]> csvData, String filename) {
        writeData(csvData, CSV_FOLDER_DIR, filename);
    }

    public static void writeData(List<String[]> csvData, String path, String filename) {

        try (CSVWriter writer = new CSVWriter(new FileWriter(path + filename))) {
            writer.writeAll(csvData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
