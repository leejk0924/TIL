package Chapter05.inheritance3_gtc.polymorphism1.Tv;

public class LgTV implements TV {
    public LgTV() {
        System.out.println("-> LG TV 생성");
    }

    public void powerOn() {
        System.out.println("(LG) 전원을 켠다.");
    }

    public void powerOff() {
        System.out.println("(LG) 전원을 끈다.");
    }
    public void volumeUp() {
        System.out.println("(LG) 소리를 올린다.");
    }
    public void volumeDown() {
        System.out.println("(LG) 소리를 내린다.");
    }
}
