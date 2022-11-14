package designPatter.bridge;

public class BridgeTest {

    /**
     * 桥接模式
     * @param args
     */
    public static void main(String[] args) {
        Engine newBeeEngine = new NewBeeEngine();
        BMWCar bmwCar = new BMWCar(newBeeEngine);
        bmwCar.drive();

        Engine lowEngine = new LowEngine();
        BossCar bossCar = new BossCar(lowEngine);
        bossCar.drive();
    }
}
