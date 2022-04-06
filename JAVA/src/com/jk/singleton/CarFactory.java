package com.jk.singleton;

public class CarFactory {
    private static int serialNum = 10000;
    private static CarFactory Instance = new CarFactory();



    public static CarFactory getInstance() {
        if (Instance == null) {
            Instance = new CarFactory();
        }
        return Instance;
    }

    public Car createCar() {
        Car car = new Car();
        car.setCarNum(++serialNum);
        return car;
    }

}
