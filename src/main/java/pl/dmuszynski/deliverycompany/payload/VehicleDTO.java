package pl.dmuszynski.deliverycompany.payload;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class VehicleDTO implements Serializable {
    private final long idVehicle;
    private final String model;
    private final String brand;
    private final String vehicleType;
}
