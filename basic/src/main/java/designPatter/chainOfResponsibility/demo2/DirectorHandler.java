package designPatter.chainOfResponsibility.demo2;

import designPatter.chainOfResponsibility.common.Request;

public class DirectorHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        System.out.println("Director adopt");
        return true;
    }
}
