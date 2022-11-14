package designPatter.bridge;

public class LowEngine implements Engine{
    @Override
    public void start() {
        System.out.println("low engine start");
    }
}
