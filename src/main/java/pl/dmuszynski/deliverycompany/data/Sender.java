package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Sender extends AbstractEntity{
    private final Person person;

    public Sender(long id, Person person) {
        super(id);
        this.person = person;
    }
}
