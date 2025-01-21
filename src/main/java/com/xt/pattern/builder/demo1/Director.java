package com.xt.pattern.builder.demo1;

public class Director {
    // 持有一个抽象建造者对象
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
