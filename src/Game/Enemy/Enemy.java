package Game.Enemy;

import Game.Enemy.Move.Hit;
import Game.Enemy.Move.Move;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
    private String name;
    private int HP;
    private int shield = 0;
    private List<Move> moves = new ArrayList<>();

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

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void addShield(int shield) {
        this.shield += shield;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
}
