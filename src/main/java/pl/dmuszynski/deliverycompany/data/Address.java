package pl.dmuszynski.deliverycompany.data;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Address {
    private final String street;
    private final String city;
    private final String buildingNumber;
}
