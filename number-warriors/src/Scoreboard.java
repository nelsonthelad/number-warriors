public class Scoreboard {
    private int player1Score;
    private int player2Score;
    private Warrior player1;
    private Warrior player2;
    public Scoreboard(Warrior player1, Warrior player2) {
        this.player1 = player1;
        this.player2 = player2;
        player1Score = 0;
        player2Score = 0;
    }

}
