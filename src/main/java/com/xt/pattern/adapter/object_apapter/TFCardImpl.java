package com.xt.pattern.adapter.object_apapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TF卡读取数据 : hello word ";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF中写数据");
    }
}
