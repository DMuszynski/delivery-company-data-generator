package pl.dmuszynski.deliverycompany.payload;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class TimeDTO implements Serializable {
    private final long idTime;
    private final int day;
    private final int month;
    private final int quarter;
    private final int year;
}
