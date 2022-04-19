package chapter03;

public class inheritance1 {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();





        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(a instanceof B);
        System.out.println(b instanceof B);

    }
}

class A{
    int i = 10;
    A() {

    }
}

class B extends A {
    int j = 100;
    B() {
        super();

    }
}
class C extends B{
    int k = 1000;
}