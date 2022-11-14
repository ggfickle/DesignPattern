package designPatter.decorator;

public class GreenGemDecorator implements IGemDecorator{

    private final IEquip iEquip;

    public GreenGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int caculateAttack() {
        return 4 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return "green Gem";
    }
}
