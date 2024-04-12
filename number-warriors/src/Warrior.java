public class Warrior {
    private double health;
    private double maxHealth;
    private double maxAttack;
    private String name;
    public Warrior(double maxHealth, double maxAttack, String name) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.maxAttack = maxAttack;
        this.health = maxHealth;
    }
    public double attack(int targetNumber, int selectedNumber) {
        return Math.abs(targetNumber - selectedNumber);
    }
    public void damagePlayer(int damage) {
        health -= damage;
    }
    public void healPlayer(int damage) {
        health += damage;
    }
    public String playerStats() {
        return name + ": (Health: " + maxHealth + ") (Attack: " + maxAttack + ")";
    }

}