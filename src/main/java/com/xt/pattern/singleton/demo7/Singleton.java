package com.xt.pattern.singleton.demo7;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //当进行反序列化是，会自动调用该方法，将该方法的返回值进行返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
