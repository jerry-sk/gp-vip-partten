package com.jerry.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 21:12
 */

public class Test {
    public static void main(String[] args) {
        GPer gPer =  GPer.getInstance();

        Teacher teacher = new Teacher("Tom");
        gPer.addObserver(teacher);//相当于addListener


        Question question = new Question();
        question.setUsername("jerry");
        question.setContent("eeeeeeeeee");

        gPer.publicshQuestion(question);//触发事件

    }

}
