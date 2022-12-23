package pl.dmuszynski.deliverycompany.data;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Person {
    private final String name;
    private final String lastname;
    private final String phone;
    private final Address address;
}
