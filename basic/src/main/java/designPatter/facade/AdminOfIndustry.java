package designPatter.facade;

/**
 * 工商注册
 */
public class AdminOfIndustry {

    public String register(String name) {
        System.out.println(name + " register success, then you can go to bank open account");
        return name;
    }
}
