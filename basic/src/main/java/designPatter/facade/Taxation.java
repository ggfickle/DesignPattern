package designPatter.facade;

public class Taxation {
    public String applyTaxCode(String name) {
        System.out.println(name + " apply tax code success");
        return name;
    }
}
