package chapter03.ch7_abstract_class;

public class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }
}
