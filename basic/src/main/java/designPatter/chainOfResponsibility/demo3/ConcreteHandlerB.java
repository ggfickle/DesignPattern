package designPatter.chainOfResponsibility.demo3;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 14:57
 */
public class ConcreteHandlerB extends AbstractHandler{

    @Override
    public void doHandler(String condition) {
        if (condition.equals("B")) {
            System.out.println("ConcreteHandlerB处理");
        } else {
            System.out.println("ConcreteHandlerB不处理，由其他的Handler处理");
            super.getNextHandler().doHandler(condition);
        }
    }
}
