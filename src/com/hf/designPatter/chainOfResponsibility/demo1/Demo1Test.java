package com.hf.designPatter.chainOfResponsibility.demo1;

import com.hf.designPatter.chainOfResponsibility.common.Request;

public class Demo1Test {

    /**
     * 责任链模式1:每条链都能处理到请求
     * @param args
     */
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        BossHandler bossHandler = new BossHandler();
        ManagerHandler managerHandler = new ManagerHandler(bossHandler);
        DirectorHandler directorHandler = new DirectorHandler(managerHandler);
        handlerChain.addHandler(directorHandler);
        handlerChain.addHandler(managerHandler);
        handlerChain.addHandler(bossHandler);
        handlerChain.process(new Request("Bob"));
    }
}
