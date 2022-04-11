package chapter03.ch5_polymorphism;

public class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아다닙니다.");
    }
    public void flying() {
        System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
    }
}

