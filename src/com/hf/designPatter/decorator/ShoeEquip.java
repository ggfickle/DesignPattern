package com.hf.designPatter.decorator;

public class ShoeEquip implements IEquip{

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "shoe";
    }
}
