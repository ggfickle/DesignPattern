package designPatter.strategy.demo2;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 21:16
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("strategy A method");
    }
}
