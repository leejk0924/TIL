package chapter03.ch16.practice;

public class MainBoardPlay {
    public static void main(String[] args) {
        BeginnerLevel beginnerLevel = new BeginnerLevel();
        AdvancedLevel advancedLevel = new AdvancedLevel();
        SuperLevel superLevel = new SuperLevel();
        Player player1 = new Player(beginnerLevel);
        player1.play(1);

        player1.upgradeLevel(advancedLevel);
        player1.play(2);

        player1.upgradeLevel(superLevel);
        player1.play(3);
    }
}
