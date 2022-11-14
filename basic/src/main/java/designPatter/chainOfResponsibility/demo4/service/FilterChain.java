package designPatter.chainOfResponsibility.demo4.service;

import designPatter.chainOfResponsibility.demo4.domain.Request;
import designPatter.chainOfResponsibility.demo4.domain.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiehongfei
 * @description
 * @date 2022/11/6 15:34
 */
public class FilterChain implements Filter {

    private int index = 0;

    private List<Filter> filterList = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filterList.size()) {
            return;
        }
        Filter filter = filterList.get(index);
        index++;
        filter.doFilter(request, response, chain);
    }
}
