package com.xt.pattern.factory.sinple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            System.out.println("对不起，您点的咖啡没有");
        }
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
