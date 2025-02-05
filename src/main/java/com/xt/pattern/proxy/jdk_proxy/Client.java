package com.xt.pattern.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
