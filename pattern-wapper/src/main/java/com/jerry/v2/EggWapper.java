package com.jerry.v2;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 20:09
 */
//煎饼的包装器，但是不管如何包装还是煎饼因此继承BasebatterCake
public class EggWapper extends BatterCakeWapper {

    public EggWapper(BatterCake2 batterCake2) {
        super(batterCake2);
    }



    protected  String getMsg(){
        return super.getMsg()+"加个鸡蛋";
    }

    protected int price(){
        return super.price()+1;
    }
}
