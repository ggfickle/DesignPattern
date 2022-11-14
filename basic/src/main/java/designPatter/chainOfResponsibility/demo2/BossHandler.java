package designPatter.chainOfResponsibility.demo2;

import designPatter.chainOfResponsibility.common.Request;

public class BossHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        if (request.getName().equals("zhangsan")) {
            System.out.println("Boss refuse");
            return false;
        }
        if (request.getName().equals("lisi")) {
            System.out.println("Boss adopt");
            return true;
        }
        System.out.println("Boss refuse");
        return null;
    }
}
