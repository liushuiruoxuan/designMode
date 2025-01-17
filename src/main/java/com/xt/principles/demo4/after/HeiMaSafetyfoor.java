package com.xt.principles.demo4.after;

public class HeiMaSafetyfoor implements AntiTheft, Waterproof, Fireproof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
