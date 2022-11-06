package com.hf.designPatter.strategy.demo2;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 21:25
 */
public class StrategyFactory {

    public static void strategyMethod(String type) {
        Strategy strategy;
        if("a".equals(type)) {
            strategy = new ConcreteStrategyA();
        } else {
            strategy = new ConcreteStrategyB();
        }

        StrategyContext context = new StrategyContext(strategy);

        context.contextMethod();
    }
}
