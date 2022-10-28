package com.hf.designPatter.chainOfResponsibility.demo2;

import com.hf.designPatter.chainOfResponsibility.common.Request;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class HandlerChain {
    private List<Handler> handlerList = new CopyOnWriteArrayList<>();

    private Request request;

    public HandlerChain(Request request) {
        this.request = request;
    }

    public void addHandler(Handler handler) {
        handlerList.add(handler);
    }

    public void doHandler() {
        for (Handler handler : handlerList) {
            Boolean result = handler.process(request);
            if (!Boolean.TRUE.equals(result)) {
                System.out.println("chain shutdown");
                return;
            }
        }
    }
}
