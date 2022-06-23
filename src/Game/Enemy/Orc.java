package Game.Enemy;

import Game.Enemy.Move.Hit;
import Game.Enemy.Move.Shield;

public class Orc extends Enemy{
    public Orc() {
        super("Orc", 75);
        this.getMoves().add(new Hit(15, this));
        this.getMoves().add(new Shield(10, this));
    }
}
