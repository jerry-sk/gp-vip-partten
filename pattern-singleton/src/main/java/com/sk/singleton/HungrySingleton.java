package com.sk.singleton;

/**
 * 饿汉式单列
 */
public class HungrySingleton {
    /**
     * step1:私有化构造函数
     * step2:保证唯一性
     * step3:
     * step4:防止序列化破坏单列
     * step5:防止放射破坏单列
     * */
    private HungrySingleton() {
        if(hungrySingleton!=null){
            System.out.println(hungrySingleton);
            throw new RuntimeException("单列不允许被破坏.");
        }
    }
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    public static  HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
