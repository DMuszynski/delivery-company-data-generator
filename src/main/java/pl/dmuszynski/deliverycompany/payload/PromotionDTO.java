package pl.dmuszynski.deliverycompany.payload;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PromotionDTO {
    private final long idPromotion;
    private final short percentValue;
    private final String promotionType;
}
