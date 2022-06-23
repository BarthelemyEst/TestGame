package Game.Enemy;

import Game.Enemy.Move.Hit;

public class Rat extends Enemy{

    public Rat() {
        super("Rat", 25);
        this.getMoves().add(new Hit(5, this));
    }
}
