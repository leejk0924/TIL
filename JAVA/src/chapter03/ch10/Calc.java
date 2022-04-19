package chapter03.ch10;

public interface Calc {
    public static final double PI = 3.14;
    public static final int ERROR = -999999999;

    public abstract int add(int num1, int num2);

    public abstract int substract(int num1, int num2);

    public abstract int times(int num1, int num2);

    public abstract int divide(int num1, int num2);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
    }

    static int total(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;

    }
}

