package com.hf.designPatter.decorator;

public class ArmEquip implements IEquip {

    /**
     * 计算Attack
     *
     * @return
     */
    @Override
    public int caculateAttack() {
        return 15;
    }

    /**
     * 描述
     *
     * @return
     */
    @Override
    public String description() {
        return "武器";
    }
}
