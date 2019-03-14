package com.sk.singleton;

import java.io.*;

/**可以通过序列化和方序列化来破坏单列**/
public class SeriableSingletonTest{
    /**破坏单列**/
    public static void main(String[] args) {
        //正常的获取单列
        SeriableSingleton seriableSingleton = SeriableSingleton.getInstance();

        ObjectOutputStream objectOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(seriableSingleton);
            objectOutputStream.flush();
            objectOutputStream.close();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            /**
             * readObject 方法能创建一个新对象，同时也提供了一个会掉函数让用户自定义放回对象
             */
            SeriableSingleton seriableSingleton_2= (SeriableSingleton)objectInputStream.readObject();

            System.out.println(seriableSingleton == seriableSingleton_2);
            System.out.println(seriableSingleton);
            System.out.println(seriableSingleton_2);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
