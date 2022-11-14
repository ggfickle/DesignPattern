package designPatter.chainOfResponsibility.demo1;

import designPatter.chainOfResponsibility.common.Request;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class HandlerChain {

    private List<Handler> handlerList  = new CopyOnWriteArrayList<>();

    public void addHandler(Handler handler) {
        handlerList.add(handler);
    }

    public void process(Request request) {
        for (Handler handler : handlerList) {
            handler.process(request);
        }
    }
}
