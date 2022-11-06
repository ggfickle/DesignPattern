package com.hf.designPatter.chainOfResponsibility.demo3;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 14:57
 */
public class ConcreteHandlerA extends AbstractHandler{

    @Override
    public void doHandler(String condition) {
        if (condition.equals("A")) {
            System.out.println("ConcreteHandlerA处理");
        } else {
            System.out.println("ConcreteHandlerA不处理，由其他的Handler处理");
            super.getNextHandler().doHandler(condition);
        }
    }
}
