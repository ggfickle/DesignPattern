package designPatter.chainOfResponsibility.demo1;

import designPatter.chainOfResponsibility.common.Request;

public class BossHandler implements Handler {

    @Override
    public void process(Request request) {
        request.setRemark("Boss add remark");
        System.out.println(request);
    }
}
