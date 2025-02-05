package com.xt.pattern.proxy.cglib_proxy;

import com.xt.pattern.proxy.jdk_proxy.SellTickets;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
