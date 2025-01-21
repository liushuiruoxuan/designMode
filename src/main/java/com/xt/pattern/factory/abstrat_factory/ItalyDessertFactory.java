package com.xt.pattern.factory.abstrat_factory;

public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Dessert createDessert() {
        return new Trimsu();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
