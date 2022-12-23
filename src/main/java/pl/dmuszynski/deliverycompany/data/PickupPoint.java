package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class PickupPoint extends AbstractEntity {
    private final Address address;

    public PickupPoint(long id, Address address) {
        super(id);
        this.address = address;
    }
}
