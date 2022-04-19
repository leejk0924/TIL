package chapter04.ch04;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("java");
        System.out.println(System.identityHashCode(buffer));
        buffer.append(" good");
        System.out.println(System.identityHashCode(buffer));
        System.out.println(buffer);



    }
}
