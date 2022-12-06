package pl.dmuszynski.deliverycompany.payload;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PickupPointDTO {
    private final long idPickupPoint;
    private final String street;
    private final String city;
    private final String buildingNumber;
}
