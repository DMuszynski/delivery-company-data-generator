package pl.dmuszynski.deliverycompany.data;

/**
 * Promotion dimension
 */
public class Promotion {
    private final long idPromotion;
    private final short percentValue;
    private final String promotionType;

    public Promotion(long idPromotion, short percentValue, String promotionType) {
        this.idPromotion = idPromotion;
        this.promotionType = promotionType;
        this.percentValue = this.setPercentValue(percentValue);
    }

    public long getIdPromotion() {
        return idPromotion;
    }

    public short getPercentValue() {
        return percentValue;
    }

    public String getPromotionType() {
        return promotionType;
    }

    private short setPercentValue(short percentValue) {
        if ((percentValue > 100) || (percentValue < 0))
            throw new IllegalArgumentException();

        return percentValue;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "idPromotion=" + idPromotion +
                ", percentValue=" + percentValue +
                ", promotionType='" + promotionType + '\'' +
                '}';
    }
}
