package Game.Enemy.Move;

import Game.Enemy.Enemy;
import Game.Game.Game;

public class Hit implements Move {
    Integer damage;

    public Hit(Integer damage, Enemy enemy) {
        this.damage = damage;
    }

    @Override
    public void Action(Game game) {
        game.getHero().reduceHP(damage);
    }
}