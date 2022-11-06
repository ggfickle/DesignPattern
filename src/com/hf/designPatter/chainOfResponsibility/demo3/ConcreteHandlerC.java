package com.hf.designPatter.chainOfResponsibility.demo3;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 14:57
 */
public class ConcreteHandlerC extends AbstractHandler{

    @Override
    public void doHandler(String condition) {
        //一般是最后一个处理者
        System.out.println("ConcreteHandlerC处理");
    }
}
