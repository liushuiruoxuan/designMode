package com.xt.pattern.adapter.class_apapter;

public class Computer {

    // 读取SD卡中的数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
