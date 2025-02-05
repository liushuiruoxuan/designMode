package com.xt.pattern.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        //创建对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用代理对象
        proxyPoint.sell();
    }
}
