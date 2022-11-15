package pl.dmuszynski.deliverycompany.data;

public class Vehicle {
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
