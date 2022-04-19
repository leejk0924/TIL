package Chapter05.inheritance3_gtc.Tv;

public class GoogleTV extends TV{
    public GoogleTV() {
        System.out.println("-> Google TV 생성");
    }


    void powerOn() {
        System.out.println("(구글) 전원을 켠다.");
    }
    void powerOff() {
        System.out.println("(구글) 전원을 끈다.");
    }
    void volumeUp() {
        System.out.println("(구글) 소리를 올린다.");
    }
    void volumeDown() {
        System.out.println("(구글) 소리를 내린다.");
    }

}
