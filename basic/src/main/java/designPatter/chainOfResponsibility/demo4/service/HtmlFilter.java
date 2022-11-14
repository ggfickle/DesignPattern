package designPatter.chainOfResponsibility.demo4.service;

import designPatter.chainOfResponsibility.demo4.domain.Request;
import designPatter.chainOfResponsibility.demo4.domain.Response;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 15:37
 */
public class HtmlFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String msg = request.getMsg();
        msg = msg.concat("Html Filter Request");
        request.setMsg(msg);
        chain.doFilter(request, response, chain);
        response.setMsg(response.getMsg().concat(" Html Filter Response"));
    }
}
