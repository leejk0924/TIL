package Chapter05.inheritance3_gtc;

public class SuperTest{
    public static void main(String[] args) {
        GrandFather gF = new GrandFather();
        GrandFather gF1 = new Father();
        GrandFather gF2 = new Brother();


        GrandFather[] family = new GrandFather[4];
        family[0] = new GrandFather();
        family[1] = new Father();
        family[2] = new Brother();
        family[3] = new Me();

        System.out.println(family);
    }
}

class GrandFather {

}

class Father extends GrandFather{

}

class Brother extends Father{

}

class Me extends Father{
    int a = 10;
}
