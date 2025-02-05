package com.xt.pattern.decorator;

/**
 * 装饰者类
 */
public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + ":" + food.cost() + " 元 ");

        System.out.println("===========");
        food = new Egg(food);
        System.out.println(food.getDesc() + ":" + food.cost() + " 元 ");

        System.out.println("===========");
        food = new Bacon(food);
        System.out.println(food.getDesc() + ":" + food.cost() + " 元 ");
    }
}
