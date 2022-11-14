package designPatter.decorator;

import java.io.FileInputStream;

public class RedGemDecorator implements IGemDecorator {

    private final IEquip iEquip;

    public RedGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int caculateAttack() {
        return 3 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return "red Gem";
    }
}
