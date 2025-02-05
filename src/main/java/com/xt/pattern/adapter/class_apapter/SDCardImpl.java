package com.xt.pattern.adapter.class_apapter;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sdcard read msg:hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}
