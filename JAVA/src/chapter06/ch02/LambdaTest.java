package chapter06.ch02;

public class LambdaTest {
    public static void main(String[] args) {

        Add addL = (x, y) -> x + y;

        System.out.println(addL.add(2, 3));

        MyNumber myNumber = (x, y)-> x > y? x: y;
        System.out.println(myNumber.getMax(10, 20));

    }

}
