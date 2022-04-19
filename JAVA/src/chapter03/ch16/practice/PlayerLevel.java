package chapter03.ch16.practice;

public abstract class PlayerLevel {
    abstract public void run();
    abstract public void jmp();
    abstract public void turn();
    abstract public void showLevelMessage();

    public void go(int count) {
        showLevelMessage();
        run();
        for (int i = 0; i < count; i++) {
            jmp();
        }
        turn();

    }
}
