package com.sk.DynamicProxy;

import java.lang.reflect.Proxy;

public class JerryDynamicProxyTest  {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) throws Exception {
        JerryDynamicProxy jerryDynamicProxy = new JerryDynamicProxy();
        Object obj = (Object) jerryDynamicProxy.getInstance(new Jerry());
        // System.out.println(obj.toString());
        Person person = (Person) obj;
        person.findJob("IT","CD");
        // System.out.println(obj);
    }
}
