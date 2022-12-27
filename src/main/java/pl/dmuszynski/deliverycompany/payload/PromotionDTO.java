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
public class PromotionDTO extends AbstractEntityDTO implements Serializable {
    private final short percentValue;
    private final String promotionType;
}
