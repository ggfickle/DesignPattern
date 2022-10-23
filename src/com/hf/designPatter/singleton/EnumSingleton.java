package com.hf.designPatter.singleton;

/**
 * @author xiehongfei
 * @description 枚举单例
 * @date 2022/10/23 20:12
 */
public enum EnumSingleton {

    /**
     * instance
     */
    INSTANCE;

    EnumSingleton() {
    }

    public void method() {
        System.out.println("INSTANCE 即为单例对象，按照需要在此方法里实现对应的instance业务逻辑");
    }
}
