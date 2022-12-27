package pl.dmuszynski.deliverycompany.payload;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@ToString
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class WarehouseDTO extends AbstractEntityDTO implements Serializable {
    private final String street;
    private final String city;
    private final String buildingNumber;
}
