package com.jerry.strategy.pay;

import java.math.BigDecimal;

public class AiliPay extends  PayMent {
    String getName() {
        System.out.println("ailipay");
        return  "alipay";
    }

    BigDecimal queryBlance() {
        return new BigDecimal(1000);
    }
}
