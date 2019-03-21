package com.jerry.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 21:10
 */

/**
 * Observable jdk的实现方式
 */
public class GPer extends Observable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static GPer getgPer() {
        return gPer;
    }

    public static void setgPer(GPer gPer) {
        GPer.gPer = gPer;
    }

    private  String name = "GPer生态圈";
    private GPer(){}

    public  static  GPer  gPer = new GPer();

    public static  GPer getInstance(){
        return  gPer;
    }

    public  void publicshQuestion(Question question){
        System.out.println(question.getUsername()+"在"+this.name+"提交了一个问题.");
        setChanged();
        notifyObservers(question);
    }


}
