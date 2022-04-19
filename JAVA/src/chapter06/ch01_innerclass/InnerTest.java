package chapter06.ch01_innerclass;

public class InnerTest {
    public static void main(String[] args) {
        int outNum = 100;
        int sNum = 200;
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);
        runner.run();

        out.runnable.run();

    }

}

class Outer2 {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i) {
        final int num = 10;


        return new Runnable() {
            int localNum = 1000;

            @Override
            public void run() {
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("local = " + localNum);

                System.out.println();

            }
        };
    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}
