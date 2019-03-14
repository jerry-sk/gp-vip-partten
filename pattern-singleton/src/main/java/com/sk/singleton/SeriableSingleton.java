package com.sk.singleton;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/**可以通过序列化和方序列化来破坏单列**/
public class SeriableSingleton implements Serializable {

    private final  static  SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){
        throw  new RuntimeException("不能通过此方式初始化单列比如方式调用构造器");
    }

    public static  SeriableSingleton getInstance(){
        return  seriableSingleton;
    }

    /**让序列化不能破坏单列**/

    public Object readResolve(){
        return seriableSingleton;
    }

}
