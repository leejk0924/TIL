package chapter03.ch6_inheritance;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
