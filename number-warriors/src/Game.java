public class Game {
    Warrior player1;
    Warrior player2;
    Scoreboard score;
    public void innit(String player1Name, double player1MaxHealth, double player1Attack, String player2Name, double player2MaxHealth, double player2Attack) {
        player1 = new Warrior(player1MaxHealth, player1Attack, player1Name);
        player2 = new Warrior(player2MaxHealth, player2Attack, player2Name);
        score = new Scoreboard(player1, player2);
        System.out.println(player1.playerStats());
        System.out.println(player2.playerStats());
    }
}
