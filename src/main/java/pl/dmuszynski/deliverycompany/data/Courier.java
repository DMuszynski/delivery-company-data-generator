package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Courier extends AbstractEntity{
    private final Person person;

    public Courier(long id, Person person) {
        super(id);
        this.person = person;
    }
}
