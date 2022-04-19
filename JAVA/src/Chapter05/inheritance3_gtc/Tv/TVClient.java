package Chapter05.inheritance3_gtc.Tv;

public class TVClient {
    public static void main(String[] args) {
        TVFactory factory = new TVFactory();
        /*TV tv = new SamsungTV();
        tv.powerOn();
        tv.volumeDown();
        tv.volumeUp();
        tv.powerOff();
*/
        TV tv = (TV)factory.makeTv(args[0]);
        tv.powerOff();
        tv.volumeUp();



    }
}
