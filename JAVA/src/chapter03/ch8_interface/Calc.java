package chapter03.ch8_interface;

public interface Calc {
    public static final double PI = 3.14;
    public static final int ERROR = -999999999;

    public abstract int add(int num1, int num2);

    public abstract int substract(int num1, int num2);

    public abstract int times(int num1, int num2);

    public abstract int divide(int num1, int num2);

}
