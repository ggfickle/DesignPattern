package designPatter.facade;

public class Bank {
    public String openAccount(String name) {
        System.out.println(name + " open account success");
        return name;
    }
}
