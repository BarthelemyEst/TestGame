package Game.Enemy;

import Game.Enemy.Move.Hit;
import Game.Enemy.Move.HitAndShield;
import Game.Enemy.Move.Shield;

public class Spider extends Enemy {
    public Spider() {
        super("Spider", 25);
        this.getMoves().add(new Hit(7, this));
        this.getMoves().add(new Shield(7, this));
        this.getMoves().add(new HitAndShield(5, this));
    }
}
