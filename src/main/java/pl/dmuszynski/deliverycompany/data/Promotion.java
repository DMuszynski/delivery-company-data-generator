package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class Promotion {
    private final long idPromotion;
    private final short percentValue;
    private final String promotionType;

    public Promotion(long idPromotion, short percentValue, String promotionType) {
        this.idPromotion = idPromotion;
        this.promotionType = promotionType;
        this.percentValue = this.setPercentValue(percentValue);
    }

    private short setPercentValue(short percentValue) {
        if ((percentValue > 100) || (percentValue < 0))
            throw new IllegalArgumentException();
        return percentValue;
    }
}
