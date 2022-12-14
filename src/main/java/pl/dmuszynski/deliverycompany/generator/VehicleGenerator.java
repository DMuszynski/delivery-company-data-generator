package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleGenerator {
    private final Random random = new Random();

    private final String[] models = {
            "A1", "A2", "A3", "A4", "Q1", "Q2", "Q3",
            "Duster", "Logan", "Jumper", "DS3", "DS4", "Berlingo", "Nemo",
            "16i", "316i", "318", "330 Coupe", "Q1", "M 140i", "X5 Hybrid"
    };
    private final String[] brands = {
            "Audi", "BMW", "Citroen", "Dacia", "Fiat",
            "Ford", "Hyundai", "Kia"
    };
    private final String[] vehicleTypes = {
            "Furgon", "Kontener", "Naczepa",
            "Pojazd z planteką", "Wywrotka"
    };

    public Vehicle getRandomVehicle(long idVehicle) {
        final String randomModel = models[random.nextInt(models.length)];
        final String randomBrand = brands[random.nextInt(brands.length)];
        final String randomVehicleType = vehicleTypes[random.nextInt(vehicleTypes.length)];

        return new Vehicle(idVehicle, randomModel, randomBrand, randomVehicleType);
    }

    public List<Vehicle> getRandomVehicleList(int vehicleQuantity) {
        final List<Vehicle> randomVehicleList = new ArrayList<>(vehicleQuantity);
        for(int i = 0; i < vehicleQuantity; i++)
            randomVehicleList.add(this.getRandomVehicle(i+1));

        return randomVehicleList;
    }
}

