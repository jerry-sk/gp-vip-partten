package com.sk.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**可以通过序列化和方序列化来破坏单列**/
public class InvokeBrokenSingletonTest {
    /**破坏单列**/
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //正常的获取单列
        SeriableSingleton seriableSingleton = SeriableSingleton.getInstance();

        // Constructor[]  constructors = SeriableSingleton.class.getConstructors();
        Constructor constructor = SeriableSingleton.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);//可以调用私有的构造器
        SeriableSingleton seriableSingleton_2 = (SeriableSingleton) constructor.newInstance();

        System.out.println(seriableSingleton == seriableSingleton_2);
        System.out.println(seriableSingleton);
        System.out.println(seriableSingleton_2);

    }

}
