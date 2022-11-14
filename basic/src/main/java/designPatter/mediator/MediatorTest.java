package designPatter.mediator;

public class MediatorTest {

    /**
     * 中介模式，用一个中间类来封装多个类的行为
     * @param args
     */
    public static void main(String[] args) {
        User zhangsan = new User("zhangsan");
        User lisi = new User("lisi");

        zhangsan.sendMessage("I'm coming");
        lisi.sendMessage("watch out!");
    }
}
