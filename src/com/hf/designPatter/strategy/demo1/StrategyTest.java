package com.hf.designPatter.strategy.demo1;

import java.math.BigDecimal;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/24 21:45
 */
public class StrategyTest {
    public static void main(String[] args) {
        // 使用默认普通会员折扣
        DiscountStrategyContext discountStrategyContext = new DiscountStrategyContext();
        BigDecimal total = new BigDecimal("120");
        BigDecimal bigDecimal = discountStrategyContext.calculatePrice(total);
        System.out.println(bigDecimal);

        // 使用满减折扣
        discountStrategyContext.setDiscountStrategy(new OverDiscountStrategyImpl());
        BigDecimal bigDecimal1 = discountStrategyContext.calculatePrice(bigDecimal);
        System.out.println(bigDecimal1);
    }
}
