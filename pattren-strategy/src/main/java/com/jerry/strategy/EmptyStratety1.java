package com.jerry.strategy.promotion;

public class EmptyStratety implements PromotionStratety {

    public void doPromotion(){
        System.out.println("平时无促销");
    }
}
