package com.xt.pattern.adapter.class_apapter;

public class SDAdapterTF implements SDCard {
    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("SD TO TF");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD write TF");
        tfCard.writeTF(msg);
    }
}
