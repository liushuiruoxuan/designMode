package com.xt.principles.demo2.before;

public class RactangleDemo {
    public static void main(String[] args) {
        Ractangle r = new Ractangle();
        r.setLength(20.0);
        r.setWidth(10.0);
        resize(r);
        printLengthAndWidth(r);

        System.out.println("=====================");
        Square s = new Square();
        s.setLength(10.0);
        s.setWidth(10.0);
        resize(s);
        printLengthAndWidth(s);
    }

    public static void resize(Ractangle ractangle) {
        while (ractangle.getWidth() <= ractangle.getLength()){
            ractangle.setWidth(ractangle.getWidth() + 1);
        }
    }
    public static void printLengthAndWidth(Ractangle ractangle) {
        System.out.println("长：" + ractangle.getLength() + " 宽：" + ractangle.getWidth());
    }
}
