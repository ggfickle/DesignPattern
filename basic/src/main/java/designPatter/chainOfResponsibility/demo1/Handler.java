package designPatter.chainOfResponsibility.demo1;

import designPatter.chainOfResponsibility.common.Request;

public interface Handler {

    void process(Request request);
}
