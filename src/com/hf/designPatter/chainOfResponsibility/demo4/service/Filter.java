package com.hf.designPatter.chainOfResponsibility.demo4.service;

import com.hf.designPatter.chainOfResponsibility.demo4.domain.Request;
import com.hf.designPatter.chainOfResponsibility.demo4.domain.Response;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 15:33
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain chain);
}
