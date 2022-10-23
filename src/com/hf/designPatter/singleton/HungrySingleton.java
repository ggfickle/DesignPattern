package com.hf.designPatter.singleton;

/**
 * @author xiehongfei
 * @description 单例模式-饿汉模式(每次启动不管后期是否使用都进行对象实例化，造成资源浪费）
 * @date 2022/10/23 12:02
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
