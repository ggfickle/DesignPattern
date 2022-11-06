package com.hf.designPatter.strategy.demo1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/24 21:42
 */
public class DiscountStrategyContext {

    // 默认的策略，可设置也可不设置
    private DiscountStrategy discountStrategy = new UserDiscountStrategyImpl();

    // 可设置新策略
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // 计算总价钱
    public BigDecimal calculatePrice(BigDecimal total) {
        return total.subtract(discountStrategy.getDiscount(total)).setScale(2, RoundingMode.DOWN);
    }
}
