package com.xt.pattern.singleton.demo1;

public class Client {
    public static void main(String[] args) {
        //创建Singleton对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }
}
