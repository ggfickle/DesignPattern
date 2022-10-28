package com.hf.designPatter.chainOfResponsibility.demo2;

import com.hf.designPatter.chainOfResponsibility.common.Request;

public interface Handler {

    Boolean process(Request request);
}
