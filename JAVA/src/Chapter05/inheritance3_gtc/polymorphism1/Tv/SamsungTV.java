package Chapter05.inheritance3_gtc.polymorphism1.Tv;

public class SamsungTV implements TV {
    public SamsungTV() {
        System.out.println("-> samsung TV 생성");
    }


    @Override
    public void powerOn() {
        System.out.println("(삼성) 전원을 켠다." );
    }

    public void powerOff() {
        System.out.println("(삼성) 전원을 끈다.");
    }
    public void volumeUp() {
        System.out.println("(삼성) 소리를 올린다.");
    }
    public void volumeDown() {
        System.out.println("(삼성) 소리를 내린다.");
    }

}
