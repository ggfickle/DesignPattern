package designPatter.chainOfResponsibility.demo2;

import designPatter.chainOfResponsibility.common.Request;

public interface Handler {

    Boolean process(Request request);
}
