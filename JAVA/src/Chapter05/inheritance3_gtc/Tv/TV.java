package Chapter05.inheritance3_gtc.Tv;

public abstract class TV {
    public TV() {
        System.out.println("==> TV 생성");
    }

    abstract void powerOn();

    abstract void powerOff();
    abstract void volumeUp();
    abstract void volumeDown();

}
