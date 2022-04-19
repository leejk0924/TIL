package Chapter05.inheritance3_gtc.Tv;

public class LgTV extends TV{
    public LgTV() {
        System.out.println("-> LG TV 생성");
    }

    void powerOn() {
        System.out.println("(LG) 전원을 켠다.");
    }

    void powerOff() {
        System.out.println("(LG) 전원을 끈다.");
    }
    void volumeUp() {
        System.out.println("(LG) 소리를 올린다.");
    }
    void volumeDown() {
        System.out.println("(LG) 소리를 내린다.");
    }
}
