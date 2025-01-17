package com.xt.pattern.singleton.demo1;

/**
 * 饿汉式1
 */
public class Singleton {

    // 在本类中创建本类对象
    private static Singleton instance = new Singleton();

    // 私有化构造方法
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
