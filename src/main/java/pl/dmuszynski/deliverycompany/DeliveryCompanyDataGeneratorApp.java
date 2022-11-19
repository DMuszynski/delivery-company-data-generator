package pl.dmuszynski.deliverycompany;

import pl.dmuszynski.deliverycompany.data.Delivery;
import pl.dmuszynski.deliverycompany.generator.DeliveryGenerator;

import java.util.List;

public class DeliveryCompanyDataGeneratorApp {
    public static void main( String[] args )
    {
        DeliveryGenerator deliveryGenerator = new DeliveryGenerator();
        List<Delivery> deliveryList = deliveryGenerator
                .generateRandomDeliveryList(5, 1,
                4,1,1,1,1,1,1);


        System.out.println(deliveryList.get(0).toString());
        System.out.println(deliveryList.get(1).toString());
        System.out.println(deliveryList.get(2).toString());
        System.out.println(deliveryList.get(3).toString());
        System.out.println(deliveryList.get(4).toString());
    }
}
