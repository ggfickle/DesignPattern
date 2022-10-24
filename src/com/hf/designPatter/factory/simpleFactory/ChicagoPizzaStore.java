package com.hf.designPatter.factory.simpleFactory;

/**
 * 此处为一个工厂
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type == null || type.equals("")) {
            throw new RuntimeException("type is not null");
        }
        if (type.equals("beef")) {
            return new ChicagoBeefPizza();
        } else if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        }
        throw new RuntimeException("type is invalid");
    }
}
