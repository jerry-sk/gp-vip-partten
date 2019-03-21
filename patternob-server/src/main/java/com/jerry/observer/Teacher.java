package com.jerry.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 21:12
 */

public class Teacher implements Observer {//观察者Observer

    private  String name;

    public Teacher(String name) {
        this.name = name;
    }
    //Observable 可以被观察的对象
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer)o;
        Question question = (Question) arg;
        System.out.println(name+"你好，\n"+"你收到了一个来自”"+gPer.getName()+"“的提问，内容如下\n"+
                question.getContent()+"\n"+
                "提问者"+question.getUsername());
    }
}
