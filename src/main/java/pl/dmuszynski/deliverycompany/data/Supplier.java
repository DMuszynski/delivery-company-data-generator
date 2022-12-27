package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Supplier extends AbstractEntity {
    private final String name;
    private final String NIP;

    public Supplier(long id, String name, String nip) {
        super(id);
        this.name = name;
        this.NIP = nip;
    }
}
