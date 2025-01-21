package com.xt.pattern.builder.demo2;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("Intel i7")
                .screen("三星")
                .memory("金士顿")
                .mainboard("华硕")
                .build();
        System.out.println(phone);
    }
}
