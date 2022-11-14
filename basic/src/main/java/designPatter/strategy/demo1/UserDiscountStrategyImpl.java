package designPatter.strategy.demo1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author xiehongfei
 * @description 普通会员策略
 * @date 2022/10/24 21:36
 */
public class UserDiscountStrategyImpl implements DiscountStrategy{
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        // 普通会员打九折
        return total.multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.HALF_UP);
    }
}
