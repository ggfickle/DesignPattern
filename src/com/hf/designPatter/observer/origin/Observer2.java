package com.hf.designPatter.observer.origin;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 22:12
 */
public class Observer2 implements Observer{
    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    /**
     * 主题被改变时调用此方法
     *
     * @param msg
     */
    @Override
    public void update(String msg) {
        System.out.printf("Observer2收到了今天的3D开奖号码-%s, 卧槽中奖了。%n", msg);
    }
}
