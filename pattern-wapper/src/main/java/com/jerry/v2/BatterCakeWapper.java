package com.jerry.v2;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 20:09
 */
//煎饼的包装器，但是不管如何包装还是煎饼因此继承BasebatterCake
public class BatterCakeWapper extends BatterCake2 {
    private BatterCake2 batterCake2;

    public BatterCakeWapper(BatterCake2 batterCake2) {
        this.batterCake2 = batterCake2;
    }

    protected  String getMsg(){
        return batterCake2.getMsg();
    }
    protected int price(){
        return batterCake2.price();
    }
}
