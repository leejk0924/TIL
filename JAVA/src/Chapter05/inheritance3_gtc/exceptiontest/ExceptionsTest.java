package Chapter05.inheritance3_gtc.exceptiontest;

public class ExceptionsTest {
    public static void main(String[] args) {
        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            System.out.println("나누기 결과 :" + (number1 / number2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 값에 문제가 있습니다. 인자값을 다시 확인해주세요");
        } catch (NumberFormatException ef) {
            System.out.println("인자값으로 정수를 입력해 주세요.");
        } catch (Exception exception) {
            System.out.println("문제를 모르겠습니다.");
        } finally {
            System.out.println("프로그램을 종료할꼐요");
        }

    }
}
