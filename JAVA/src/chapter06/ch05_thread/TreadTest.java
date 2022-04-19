package chapter06.ch05_thread;

class MyThread extends Thread {
    public void run() {
        int i;
        for (i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

class InterfaceThread implements Runnable {

    @Override
    public void run() {
        int i;
        for (i = 0; i < 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

class PriorityThread extends Thread {
    public void run() {
        int sum = 0;
        Thread t = Thread.currentThread();
        System.out.println(t + "start");
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println(t.getPriority() + "end");
    }
}

public class TreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");
        /*   extends method

        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();*/


/*
        InterfaceThread runnable = new InterfaceThread();
        Thread th1 = new Thread(runnable);

        th1.start();
        System.out.println(Thread.currentThread() + "end");
*/
        PriorityThread pt1 = new PriorityThread();
        PriorityThread pt2 = new PriorityThread();
        PriorityThread pt3 = new PriorityThread();
        pt1.setPriority(Thread.MAX_PRIORITY);
        pt2.setPriority(Thread.NORM_PRIORITY);
        pt3.setPriority(Thread.MIN_PRIORITY);


        pt1.start();
        pt2.start();
        pt3.start();


    }
}
