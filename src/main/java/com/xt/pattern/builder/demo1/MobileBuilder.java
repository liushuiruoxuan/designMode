package com.xt.pattern.builder.demo1;

public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("膜拜车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("膜拜车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
