package com.xt.pattern.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理点收取一定的服务费用...(jdk)");
                    System.out.println("JDK代理开始...");
                    Object result = method.invoke(trainStation, args);
                    System.out.println("JDK代理结束...");
                    return result;
                }
        );
    }
}
