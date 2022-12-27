package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Receiver extends AbstractEntity {
    private final Person person;

    public Receiver(long id, Person person) {
        super(id);
        this.person = person;
    }
}
