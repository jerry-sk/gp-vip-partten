package com.jerry.strategy;

import com.jerry.strategy.promotion.PromotionStratety;

public class EmptyStratety1 implements PromotionStratety {

     public void doPromotion(){
        System.out.println("平时无促销");
    }
}
