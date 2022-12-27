package pl.dmuszynski.deliverycompany.data;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@EqualsAndHashCode
@AllArgsConstructor
public abstract class AbstractEntity {
    private final long id;
}
