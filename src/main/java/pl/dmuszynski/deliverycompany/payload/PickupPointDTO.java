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
public class PickupPointDTO implements Serializable {
    private final long idPickupPoint;
    private final String street;
    private final String city;
    private final String buildingNumber;
}
