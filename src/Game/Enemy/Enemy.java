package Game.Enemy;

public class Enemy {
    private String name;
    private int HP;
    private int damage;

    public Enemy(String name, int HP, int damage) {
        this.name = name;
        this.HP = HP;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
