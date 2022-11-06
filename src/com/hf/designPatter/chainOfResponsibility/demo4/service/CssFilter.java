package com.hf.designPatter.chainOfResponsibility.demo4.service;

import com.hf.designPatter.chainOfResponsibility.demo4.domain.Request;
import com.hf.designPatter.chainOfResponsibility.demo4.domain.Response;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 15:40
 */
public class CssFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setMsg(request.getMsg().concat(" CSS Filter Request"));
        chain.doFilter(request, response, chain);
        response.setMsg(response.getMsg().concat(" CSS Filter Response"));
    }
}
