package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class Warehouse extends AbstractEntity {
    private final Address address;

    public Warehouse(long id, Address address) {
        super(id);
        this.address = address;
    }
}
