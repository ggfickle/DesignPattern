package com.hf.designPatter.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        IEquip equip1 = new GreenGemDecorator(new YellowGemDecorator(new ArmEquip()));
        System.out.println("1 green Gem and 1 Yellow Gem arm");
        System.out.println("equip.caculateAttack() = " + equip1.caculateAttack());
        System.out.println("equip.description() = " + equip1.description());

        IEquip equip2 = new RedGemDecorator(new YellowGemDecorator(new GreenGemDecorator(new ShoeEquip())));
        System.out.println("1 green Gem and 1 Yellow Gem and 1 read gem shoe");
        System.out.println("equip.caculateAttack() = " + equip2.caculateAttack());
        System.out.println("equip.description() = " + equip2.description());
    }
}
