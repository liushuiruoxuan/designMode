package com.xt.pattern.factory.static_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
//        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
//        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
