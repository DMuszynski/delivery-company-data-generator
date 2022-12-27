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
public class TimeDTO extends AbstractEntityDTO implements Serializable {
    private final int day;
    private final int month;
    private final int quarter;
    private final int year;
}
