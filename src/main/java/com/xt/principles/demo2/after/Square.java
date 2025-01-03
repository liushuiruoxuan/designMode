package com.xt.principles.demo2.after;


/**
 * 正方形
 */
public class Square implements Quadrilateral{
    private Double side;

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
