package com.xt.pattern.factory.abstrat_factory;

public class Client {
    public static void main(String[] args) {
//        ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        Dessert dessert = factory.createDessert();
        dessert.show();
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
