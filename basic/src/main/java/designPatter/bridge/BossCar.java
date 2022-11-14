package designPatter.bridge;

public class BossCar extends Car{

    public BossCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("boss car drive");
        this.engine.start();
    }
}
