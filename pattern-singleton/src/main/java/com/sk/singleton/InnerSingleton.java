package com.sk.singleton;

/**
 * 懒汉式单列
 */
public class InnerSingleton {
    /**
     * step1:私有化构造函数
     * step2:保证唯一性
     * step3:
     * step4:防止序列化破坏单列
     * step5:防止放射破坏单列
     * */
    private InnerSingleton() {
        if(InnerClassHolder.INNER_SINGLETON!=null){
            System.out.println(InnerClassHolder.INNER_SINGLETON);
            throw new RuntimeException("单列不允许被破坏.");
        }
    }

    /***static 保证方法不被重载重新**/
    public static final InnerSingleton getInstance(){
        return InnerClassHolder.INNER_SINGLETON;
    }
    /**内部类只有在使用的时候在能被加载**/
    private static class InnerClassHolder{
        public final static InnerSingleton INNER_SINGLETON = new InnerSingleton();
    }

}
