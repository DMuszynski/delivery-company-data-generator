package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Vehicle extends AbstractEntity {
    private final String model;
    private final String brand;
    private final String vehicleType;

    public Vehicle(long id, String model, String brand, String vehicleType) {
        super(id);
        this.model = model;
        this.brand = brand;
        this.vehicleType = vehicleType;
    }
}
