package chapter03.ch16.practice;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("첨첨히 달립니다.");
    }

    @Override
    public void jmp() {
        System.out.println("jump 못하지롱");
    }

    @Override
    public void turn() {
        System.out.println("turn 못하지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 초급자 레벨입니다. ******");
    }
}
