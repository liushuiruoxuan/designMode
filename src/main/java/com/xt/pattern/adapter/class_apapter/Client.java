package com.xt.pattern.adapter.class_apapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);


        System.out.println("===================");
        SDAdapterTF sdApaterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdApaterTF);
        System.out.println(msg1);
    }
}
