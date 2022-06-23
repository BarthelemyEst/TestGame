package Game.Enemy;

public class Enemy {
    private String name;
    private int HP;

    public Enemy(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public void changeHP(int damage) {
        this.HP += damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
