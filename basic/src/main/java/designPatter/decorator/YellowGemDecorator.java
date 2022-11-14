package designPatter.decorator;

public class YellowGemDecorator implements IGemDecorator{

    private final IEquip iEquip;

    public YellowGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int caculateAttack() {
        return 2 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return "yellow Gem";
    }
}
