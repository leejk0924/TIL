package Chapter05.inheritance3_gtc.exceptiontest;

public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            testMethod(9, 0);
        } catch (ArithmeticException e) {
            System.out.println("인자에 0넣지 마셈");
        }


    }

    private static void testMethod(int i, int j) throws ArithmeticException {
        System.out.println("두 수의 나누기 결과 " + (i /j));


    }
}
