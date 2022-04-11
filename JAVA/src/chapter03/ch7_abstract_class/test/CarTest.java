package chapter03.ch7_abstract_class.test;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        Car mCar = new ManualCar();
        mCar.run();
    }


}
