package pl.dmuszynski.deliverycompany.generator;

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

class Vehicle {
    private final long idVehicle;
    private final String registrationNumber;
    private final String model;
    private final String brand;
    private final String vehicleType;

    public Vehicle(long idVehicle, String registrationNumber, String model, String brand, String vehicleType) {
        this.idVehicle = idVehicle;
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.brand = brand;
        this.vehicleType = vehicleType;
    }

    public long getIdVehicle() {
        return idVehicle;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "idVehicle=" + idVehicle +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
