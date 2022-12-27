package pl.dmuszynski.deliverycompany.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Promotion extends AbstractEntity {
    private final short percentValue;
    private final String promotionType;

    public Promotion(long id, short percentValue, String promotionType) {
        super(id);
        this.promotionType = promotionType;
        this.percentValue = this.setPercentValue(percentValue);
    }

    private short setPercentValue(short percentValue) {
        if ((percentValue > 100) || (percentValue < 0))
            throw new IllegalArgumentException();
        return percentValue;
    }
}
