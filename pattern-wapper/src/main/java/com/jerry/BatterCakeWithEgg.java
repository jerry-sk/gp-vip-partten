package com.jerry;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 20:09
 */
//在煎饼上加一个鸡蛋
public class BatterCakeWithEgg extends  BatterCake{
    @Override
    protected String getMsg() {
        return super.getMsg() +"鸡蛋";
    }

    @Override
    protected int price() {
        return super.price() +1 ;
    }
}
