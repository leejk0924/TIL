package chapter03.ch16.problem1;

public class PlayerTest {
    public static void main(String[] args) {
/*
        PlayerLevel beginnerLevel = new BeginnerLevel();
        PlayerLevel AdvancedLevel = new AdvancedLevel();
        PlayerLevel SuperLevel = new SuperLevel();

        Player player1 = new Player("beginnerLevel");
        player1.play();
*/


        Player player = new Player();
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);


    }
}
