package com.xt.pattern.adapter.object_apapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("SD TO TF");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD write TF");
        writeTF(msg);
    }
}
