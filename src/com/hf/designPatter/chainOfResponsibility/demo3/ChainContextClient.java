package com.hf.designPatter.chainOfResponsibility.demo3;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 15:03
 */
public class ChainContextClient {

    public static void main(String[] args) {
        AbstractHandler concreteHandlerA = new ConcreteHandlerA();
        AbstractHandler concreteHandlerB = new ConcreteHandlerB();
        AbstractHandler concreteHandlerC = new ConcreteHandlerC();
        concreteHandlerA.setNextHandler(concreteHandlerB);
        concreteHandlerB.setNextHandler(concreteHandlerC);
        concreteHandlerA.doHandler("B");
    }
}
