package com.hf.designPatter.strategy.demo2;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 21:17
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Execute the corresponding method
     */
    public void contextMethod() {
        strategy.strategyMethod();
    }
}
