package com.xt.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.获取字节吗对象
        Class clazz = Singleton.class;
        //2.获取无参构造对象
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton instance = (Singleton) cons.newInstance();
        Singleton instance1 = (Singleton) cons.newInstance();
        System.out.println(instance == instance1);

    }
}
