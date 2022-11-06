package com.hf.designPatter.chainOfResponsibility.demo3;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 14:53
 */
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void doHandler(String condition);
}
