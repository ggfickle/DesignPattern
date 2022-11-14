package designPatter.factory.simpleFactory;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    protected Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
