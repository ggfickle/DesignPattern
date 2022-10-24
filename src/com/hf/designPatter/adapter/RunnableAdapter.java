package com.hf.designPatter.adapter;

import java.util.concurrent.Callable;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/24 22:06
 */
public class RunnableAdapter implements Runnable{

    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
