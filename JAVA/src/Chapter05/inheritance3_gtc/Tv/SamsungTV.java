package Chapter05.inheritance3_gtc.Tv;

public class SamsungTV extends TV{
    public SamsungTV() {
        System.out.println("-> samsung TV 생성");
    }

    void powerOn() {
        System.out.println("(삼성) 전원을 켠다.");
    }

    void powerOff() {
        System.out.println("(삼성) 전원을 끈다.");
    }
    void volumeUp() {
        System.out.println("(삼성) 소리를 올린다.");
    }
    void volumeDown() {
        System.out.println("(삼성) 소리를 내린다.");
    }

}
