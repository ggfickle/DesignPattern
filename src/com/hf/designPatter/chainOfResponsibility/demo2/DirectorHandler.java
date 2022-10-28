package com.hf.designPatter.chainOfResponsibility.demo2;

import com.hf.designPatter.chainOfResponsibility.common.Request;

public class DirectorHandler implements Handler{

    @Override
    public Boolean process(Request request) {
        System.out.println("Director adopt");
        return true;
    }
}
