package designPatter.factory.simpleFactory;

public class StartOrderingPizza {
    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
        System.out.println("--------");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("beef");
    }
}