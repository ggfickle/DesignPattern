package com.hf.designPatter.singleton;

/**
 * @author xiehongfei
 * @description 静态内部类形式
 * @date 2022/10/23 18:23
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class StaticSingletonHolder{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticSingletonHolder.instance;
    }
}
