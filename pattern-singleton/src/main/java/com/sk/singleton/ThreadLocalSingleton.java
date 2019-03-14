package com.sk.singleton;

import java.util.Map;

public class ThreadLocalSingleton {
    private  ThreadLocalSingleton(){};
    /**每个线程都有一个唯一的一个String**/
    public final static ThreadLocal<String> dataSource = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "DB_SOURCE1";//默认数据源
        }
    };

    public String getInstance(){
       return dataSource.get();
    }
}
