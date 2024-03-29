package designPatter.chainOfResponsibility.demo1;

import designPatter.chainOfResponsibility.common.Request;

public class ManagerHandler implements Handler {

    private Handler handler;

    public ManagerHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(Request request) {
        request.setRemark("manager add remark");
        System.out.println(request);
    }
}
