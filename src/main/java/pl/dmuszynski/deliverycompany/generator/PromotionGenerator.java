package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PromotionGenerator {
    private final Random random = new Random();
    private final List<Promotion> promotionList;
    private final String[] promotionType = {
            "Immediate offers and discounts",
            "Vouchers and discount coupons",
            "Cumulative promotions",
            "Promotions with special conditions",
            "Loyalty programs"
    };

    public PromotionGenerator() {
        this.promotionList = this.initPromotionList();
    }

    private List<Promotion> initPromotionList() {
        final List<Promotion> tmpPromotionList = new ArrayList<>(this.promotionType.length);
        for (int i = 0; i < this.promotionType.length; ++i)
            tmpPromotionList.add(new Promotion(i+1, (short) random.nextInt(100), promotionType[i]));

        return tmpPromotionList;
    }

    public List<Promotion> getRandomPromotionList() {
        return promotionList;
    }
}

