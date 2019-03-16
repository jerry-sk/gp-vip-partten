package com.jerry.strategy;

import com.jerry.strategy.pay.Order;
import com.jerry.strategy.pay.PayResult;
import com.jerry.strategy.pay.PayStrategy;

import java.math.BigDecimal;
import java.util.HashMap;

public class PayStrategyTest extends  Order {

    public PayStrategyTest(String orderKey, String goodsno, BigDecimal amount) {
        super(orderKey, goodsno, amount);
    }

    private void test() {
         Order order = new Order();
         this.pay(PayStrategy.TENCENT_PAY);
    }

    public static void main(String[] args) {
        Order order = new Order("0001","T恤",new BigDecimal(600));
        PayResult payResult = (PayResult) order(PayStrategy.TENCENT_PAY);
        System.out.println(payResult);
    }
}
