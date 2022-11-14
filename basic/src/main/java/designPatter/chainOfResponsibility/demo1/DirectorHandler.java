package designPatter.chainOfResponsibility.demo1;

import designPatter.chainOfResponsibility.common.Request;

public class DirectorHandler implements Handler {

    private Handler handler;

    public DirectorHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(Request request) {
        if (request == null ) {
            return;
        }
        if (request.getName().equals("Bob")) {
            request.setRemark("Director not add remark");
        } else {
            request.setRemark("Director add remark");
        }
        System.out.println(request);
    }
}
