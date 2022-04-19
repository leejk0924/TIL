package Chapter05.inheritance3_gtc.polymorphism1.Tv;

public class GoogleTV implements TV {
    public GoogleTV() {
        System.out.println("-> Google TV 생성");
    }


    public void powerOn() {
        System.out.println("(구글) 전원을 켠다.");
    }
    public void powerOff() {
        System.out.println("(구글) 전원을 끈다.");
    }
    public void volumeUp() {
        System.out.println("(구글) 소리를 올린다.");
    }
    public void volumeDown() {
        System.out.println("(구글) 소리를 내린다.");
    }

}
