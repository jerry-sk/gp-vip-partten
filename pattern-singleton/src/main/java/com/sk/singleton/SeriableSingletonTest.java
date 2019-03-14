package com.sk.singleton;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/**可以通过序列化和方序列化来破坏单列**/
public class SeriableSingleton implements Serializable {

    private final  static  SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static  SeriableSingleton getInstance(){
        return  seriableSingleton;
    }


    /**破坏单列**/
    public static void main(String[] args) {

        SeriableSingleton.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream()
    }

}
