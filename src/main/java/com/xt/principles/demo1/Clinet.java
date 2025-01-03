package com.xt.principles.demo1;

public class Clinet {
    public static void main(String[] args) {
        //1.创建输入法
        SougouInput sougouInput = new SougouInput();
        //2.创建皮肤对象
//        DefultSkin defultSkin = new DefultSkin();
//        sougouInput.setSkin(defultSkin);
        ComSkin comSkin = new ComSkin();
        sougouInput.setSkin(comSkin);
        sougouInput.display();
    }
}
