package com.xt.pattern.proxy.static_proxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
