package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Time extends AbstractEntity {
    private final int day;
    private final int month;
    private final int quarter;
    private final int year;

    public Time(long id, int day, int month, int quarter, int year) {
        super(id);
        this.day = day;
        this.month = month;
        this.quarter = quarter;
        this.year = year;
    }
}
