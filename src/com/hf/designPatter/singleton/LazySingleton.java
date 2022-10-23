package com.hf.designPatter.singleton;

/**
 * @author xiehongfei
 * @description 单例模式-懒汉模式(按需加载,双重加锁)
 * @date 2022/10/23 12:53
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
