package designPatter.chainOfResponsibility.demo2;

import designPatter.chainOfResponsibility.common.Request;

public class ManagerHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        if (request.getName().equals("lisi")) {
            System.out.println("Manager adopt");
            return true;
        }
        System.out.println("Manager refuse");
        return false;
    }
}
