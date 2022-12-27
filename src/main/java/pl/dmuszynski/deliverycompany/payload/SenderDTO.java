package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@ToString
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class SenderDTO extends AbstractEntityDTO implements Serializable {
    private final String name;
    private final String lastname;
    private final String phone;
    private final String street;
    private final String city;
    private final String buildingNumber;
}
