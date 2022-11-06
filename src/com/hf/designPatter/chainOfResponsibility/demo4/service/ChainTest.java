package com.hf.designPatter.chainOfResponsibility.demo4.service;

import com.hf.designPatter.chainOfResponsibility.demo4.domain.Request;
import com.hf.designPatter.chainOfResponsibility.demo4.domain.Response;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 15:41
 */
public class ChainTest {

    public static void main(String[] args) {
        String msg = ":):,<script>,敏感,被就业,网络授课";
        //过滤请求
        Request request=new Request();
        //set方法，将待处理字符串传递进去
        request.setMsg(msg);
        //处理过程结束，给出的响应
        Response response=new Response();
        //设置响应信息
        response.setMsg("response:");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter())
                .addFilter(new CssFilter());
        filterChain.doFilter(request, response, filterChain);
        //打印请求信息
        System.out.println(request.getMsg());
        //打印响应信息
        System.out.println(response.getMsg());
    }
}
