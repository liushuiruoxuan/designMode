package com.xt.principles.demo2.after;

public class RactangleDemo {
    public static void main(String[] args) {

        Ractangle r = new Ractangle();
        r.setLength(20.0);
        r.setWidth(10.0);
        //调用方法进行扩宽
        resize(r);
        printLengthAndWidth(r);
    }

    //扩宽方法
    public static void resize(Ractangle ractangle) {
        while (ractangle.getWidth() <= ractangle.getLength()) {
            ractangle.setWidth(ractangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("长：" + quadrilateral.getLength() + "，宽：" + quadrilateral.getWidth());
    }
}
