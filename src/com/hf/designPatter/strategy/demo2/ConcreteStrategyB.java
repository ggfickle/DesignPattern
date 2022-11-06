package com.hf.designPatter.strategy.demo2;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 21:16
 */
public class ConcreteStrategyB implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("strategy B method");
    }
}
