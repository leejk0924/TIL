package Chapter05.inheritance3_gtc.polymorphism1.Tv;

public class TVFactory {
    TV makeTv(String tvId) {
        if (tvId.equals("lg")) {
            return new LgTV();
        } else if (tvId.equals(("samsung"))) {
            return new SamsungTV();
        } else if (tvId.equals(("google"))) {
            return new GoogleTV();
        }
        return null;
    }
}
