package com.jerry;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 20:09
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg()+"价格"+batterCake.price());

        BatterCakeWithEgg batterCake1 = new BatterCakeWithEgg();
        System.out.println(batterCake1.getMsg()+"价格"+batterCake1.price());


        //JAVA.IO;httpHeadReponseDecorator
    }
}
