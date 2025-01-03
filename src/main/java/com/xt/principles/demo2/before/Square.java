package com.xt.principles.demo2.before;

/**
 * 正方形类
 */
public class Square extends Ractangle {
    @Override
    public void setWidth(Double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(Double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}
