package src.com.dragon.units;

public class Warrior {

    protected int health;
    protected int attackScore;
    protected int speed;
    protected int strong;
    protected String name;

    public Warrior(int health, int attackScore, int speed, int strong, String name) {
        this.health = health;
        this.attackScore = attackScore;
        this.speed = speed;
        this.strong = strong;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
