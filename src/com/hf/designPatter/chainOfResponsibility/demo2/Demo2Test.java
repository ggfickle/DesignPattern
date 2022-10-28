package com.hf.designPatter.chainOfResponsibility.demo2;

import com.hf.designPatter.chainOfResponsibility.common.Request;

public class Demo2Test {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain(new Request("张三"));
        handlerChain.addHandler(new DirectorHandler());
        handlerChain.addHandler(new ManagerHandler());
        handlerChain.addHandler(new BossHandler());

        handlerChain.doHandler();
    }
}
