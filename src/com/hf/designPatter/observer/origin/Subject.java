package com.hf.designPatter.observer.origin;

/**
 * @author xiehongfei
 * @description 主题接口，所有的主题必须实现此接口
 * @date 2022/10/23 21:58
 */
public interface Subject {

    /**
     * 注册一个观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 同志所有的观察者
     */
    void notifyObservers();
}
