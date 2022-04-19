package chapter03.ch16.practice;

public class Player {
    private PlayerLevel level;


    public Player(){}

    public Player(PlayerLevel level) {
        this.level = level;
        this.level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int count) {
        level.go(count);

    }
}
