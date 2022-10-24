package com.hf.designPatter.factory.simpleFactory;

/**
 * 此处为一个工厂
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type == null || type.equals("")) {
            throw new RuntimeException("type is not null");
        }
        if (type.equals("beef")) {
            return new NYBeefPizza();
        } else if (type.equals("cheese")) {
            return new NYCheesePizza();
        }
        throw new RuntimeException("type is invalid");
    }
}
