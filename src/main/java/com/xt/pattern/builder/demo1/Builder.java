package com.xt.pattern.builder.demo1;

/**
 * 构建者
 * <p>
 * 创建所有行为
 */
public abstract class Builder {

    /**
     * 构建者所创建的产品
     */
    protected Bike bike = new Bike();

    /**
     * 构建产品
     */
    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
