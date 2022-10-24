package com.hf.designPatter.adapter;

import java.util.concurrent.Callable;

/**
 * @author xiehongfei
 * @description 这是A接口
 * @date 2022/10/24 22:03
 */
public class Task implements Callable<Long> {
    private long num;
    public Task(long num) {
        this.num = num;
    }
    @Override
    public Long call() throws Exception {
        long r = 0;
        for (long n = 1; n <= this.num; n++) {
            r = r + n;
        }
        System.out.println("Result: " + r);
        return r;
    }
}
