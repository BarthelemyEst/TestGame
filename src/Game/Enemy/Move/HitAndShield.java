package Game.Enemy.Move;

import Game.Enemy.Enemy;
import Game.Game.Game;

public class HitAndShield implements Move {
    private Enemy enemy;
    private Integer damageAndShield;

    public HitAndShield(Integer damage, Enemy enemy) {
        this.damageAndShield = damage;
        this.enemy = enemy;
    }

    @Override
    public void Action(Game game) {
        game.getHero().reduceHP(damageAndShield);
        enemy.addShield(damageAndShield);
    }
}