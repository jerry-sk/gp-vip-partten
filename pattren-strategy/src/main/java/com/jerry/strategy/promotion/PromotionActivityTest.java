package com.jerry.strategy.promotion;

public class PromotionActivity {
    private  PromotionStratety promotionStratety;
    public PromotionActivity(PromotionStratety promotionStratety) {
        this.promotionStratety = promotionStratety;
    }

    public void execute(){
        promotionStratety.doPromotion();
    }
}
