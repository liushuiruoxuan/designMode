package com.xt.pattern.singleton.demo2;

/**
 * @author xt
 * @Desc 饿汉式2
 */
public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
