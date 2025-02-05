package com.xt.pattern.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation trainStation = proxyFactory.getProxyObject();
        trainStation.sell();
    }
}
