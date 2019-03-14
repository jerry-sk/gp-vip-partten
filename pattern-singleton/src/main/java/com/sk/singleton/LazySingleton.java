package com.sk.singleton;

/**
 * 懒汉式单列
 */
public class LazySingleton {
    /**
     * step1:私有化构造函数
     * step2:保证唯一性
     * step3:
     * step4:防止序列化破坏单列
     * step5:防止放射破坏单列
     * */
    private LazySingleton() {
        if(lazySingleton!=null){
            System.out.println(lazySingleton);
            throw new RuntimeException("单列不允许被破坏.");
        }
    }
    private static LazySingleton lazySingleton = null;

    public static  synchronized LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return  lazySingleton;
    }

    public static  LazySingleton getInstance_doubleCheck(){
        /**
         * 仅仅这样第一个没区别
         * 如果尽量减少锁的获得减少线程等待，外层再加个判断
         *
         * */
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
