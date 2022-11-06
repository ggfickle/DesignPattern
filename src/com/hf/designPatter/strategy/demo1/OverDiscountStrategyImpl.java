package com.hf.designPatter.strategy.demo1;

import java.math.BigDecimal;

/**
 * @author xiehongfei
 * @description 满减策略
 * @date 2022/10/24 21:39
 */
public class OverDiscountStrategyImpl implements DiscountStrategy{
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        return total.compareTo(new BigDecimal("100")) >= 0 ? new BigDecimal("10") : BigDecimal.ZERO;
    }
}
