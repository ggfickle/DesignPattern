package com.hf.designPatter.strategy;

import java.math.BigDecimal;

/**
 * @author xiehongfei
 * @description 策略模式
 * @date 2022/10/24 21:34
 */
public interface DiscountStrategy {

    // 计算折扣额度
    BigDecimal getDiscount(BigDecimal total);
}
