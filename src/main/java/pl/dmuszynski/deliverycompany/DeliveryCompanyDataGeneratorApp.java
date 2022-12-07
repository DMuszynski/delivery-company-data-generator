package pl.dmuszynski.deliverycompany;

import pl.dmuszynski.deliverycompany.csv.DeliveryCompanyCsvWriter;

public class DeliveryCompanyDataGeneratorApp {
    public static void main( String[] args ) {
        DeliveryCompanyCsvWriter deliveryCompanyCsvWriter = new DeliveryCompanyCsvWriter();
        deliveryCompanyCsvWriter.writeDeliveryCompanyToCsv();
    }
}
