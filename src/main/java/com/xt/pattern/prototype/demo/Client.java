package com.xt.pattern.prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype clone = r1.clone();
        System.out.println(r1);
        System.out.println(clone);
    }
}
