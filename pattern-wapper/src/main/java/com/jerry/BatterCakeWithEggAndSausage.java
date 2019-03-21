package com.jerry;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 20:09
 */
//在煎饼上加一个香肠
public class BatterCakeWithEggAndSausage extends  BatterCakeWithEgg{
    @Override
    protected String getMsg() {
        return super.getMsg() +"香肠" ;
    }

    @Override
    protected int price() {
        return super.price() +2 ;
    }
}
