package com.hf.designPatter.proxy.cglib;

/**
 * Cglib 代理模式
 */
public class CglibTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new MapServiceImpl());
        MapServiceImpl mapService = (MapServiceImpl)proxyFactory.getProxyInstance();
        mapService.show();
    }
}
