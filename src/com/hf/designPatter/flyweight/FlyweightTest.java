package com.hf.designPatter.flyweight;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/26 22:11
 */
public class FlyweightTest {

    /**
     * 运用共享技术有效地支持大量细粒度的对象。
     *
     * 享元（Flyweight）的核心思想很简单：如果一个对象实例一经创建就不可变，那么反复创建相同的实例就没有必要，
     * 直接向调用方返回一个共享的实例就行，这样即节省内存，又可以减少创建对象的过程，提高运行速度。
     * @param args
     */
    public static void main(String[] args) {
        Student student = Student.create(11, "zuck");
    }
}
