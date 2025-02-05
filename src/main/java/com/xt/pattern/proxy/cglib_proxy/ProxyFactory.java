package com.xt.pattern.proxy.cglib_proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);

        enhancer.setCallback(this);

        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("代售点收取了一定的费用////");
        Object invoke = method.invoke(trainStation, args);
        return invoke;
    }
}
