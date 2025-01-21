package com.xt.pattern.factory.factory_method;

public class Coffee {
    private String name;

    //加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }

    public String getName() {
        return name;
    }
}
