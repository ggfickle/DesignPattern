package designPatter.bridge;

public class BMWCar extends Car{

    public BMWCar(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("BMW car drive");
        this.engine.start();
    }
}
