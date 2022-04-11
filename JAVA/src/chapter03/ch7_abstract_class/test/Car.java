package chapter03.ch7_abstract_class.test;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void startCar() {
    }

    public void turnOff() {
        System.out.println("시동을을 끕니다.");
    }

    public void washCar(){

    }
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}