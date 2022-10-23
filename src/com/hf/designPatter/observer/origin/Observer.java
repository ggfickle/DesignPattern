package com.hf.designPatter.observer.origin;

/**
 * @author xiehongfei
 * @description 观察者接口，所有潜在的观察者都要实现此接口
 * @date 2022/10/23 22:00
 */
public interface Observer {

    /**
     * 主题被改变时调用此方法
     * @param msg
     */
    void update(String msg);
}
