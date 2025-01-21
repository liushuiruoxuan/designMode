package com.xt.pattern.prototype.demo;

public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
