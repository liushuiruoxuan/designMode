package com.xt.pattern.decorator;

/**
 * @author xt
 * @Desc 炒饭
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }
//    public FriedRice(float price, String desc) {
//        super(price, desc);
//    }

    @Override
    public float cost() {
        return getPrice();
    }
}
