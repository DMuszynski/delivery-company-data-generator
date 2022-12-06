package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;
import lombok.Getter;


@Getter
@ToString
@Builder
@EqualsAndHashCode
public class CourierDTO {
    private final long idCourier;
    private final String name;
    private final String lastname;
    private final String phone;
    private final String street;
    private final String city;
    private final String buildingNumber;
}
