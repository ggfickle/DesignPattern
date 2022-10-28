package com.hf.designPatter.chainOfResponsibility.demo1;

import com.hf.designPatter.chainOfResponsibility.common.Request;

public interface Handler {

    void process(Request request);
}
