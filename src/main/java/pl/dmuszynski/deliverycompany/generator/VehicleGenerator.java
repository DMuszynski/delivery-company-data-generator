package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleGenerator {
    private final String[] registrationNumbers = {
            "TJE121A",
    };
    private final String[] models = {
            "Audi",
    };
    private final String[] brands = {
            "Audi",
    };
    private final String[] vehicleTypes = {
            "Audi",
    };

    public Vehicle getRandomVehicle(long idVehicle) {
        final String randomRegistrationNumber = registrationNumbers[new Random().nextInt(registrationNumbers.length)];
        final String randomModel = models[new Random().nextInt(models.length)];
        final String randomBrand = brands[new Random().nextInt(brands.length)];
        final String randomVehicleType = vehicleTypes[new Random().nextInt(vehicleTypes.length)];

        return new Vehicle(idVehicle, randomRegistrationNumber, randomModel, randomBrand, randomVehicleType);
    }

    public List<Vehicle> getRandomVehicleList(int vehicleQuantity) {
        final List<Vehicle> randomVehicleList = new ArrayList<>(vehicleQuantity);
        for(int i = 0; i < vehicleQuantity; i++)
            randomVehicleList.add(this.getRandomVehicle(i));

        return randomVehicleList;
    }
}

