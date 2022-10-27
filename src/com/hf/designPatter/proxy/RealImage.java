package com.hf.designPatter.proxy;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/26 22:45
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("loading");
    }

    @Override
    public void display() {
        System.out.println("display" + fileName);
    }
}
