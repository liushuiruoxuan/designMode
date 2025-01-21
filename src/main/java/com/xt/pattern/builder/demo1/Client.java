package com.xt.pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike construct = director.construct();

        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());
    }
}
