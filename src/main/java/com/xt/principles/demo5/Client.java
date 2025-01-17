package com.xt.principles.demo5;

public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("王宝强"));
        agent.setFans(new Fans("小明"));
        agent.setCompany(new Company("传智播客"));
        agent.meeting();
        agent.business();
    }
}
