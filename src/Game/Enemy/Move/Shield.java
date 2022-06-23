package Game.Enemy.Move;

import Game.Enemy.Enemy;
import Game.Game.Game;

public class Shield implements Move {
    private Enemy enemy;
    private Integer shield;

    public Shield(Integer shield, Enemy enemy) {
        this.shield = shield;
        this.enemy = enemy;
    }

    @Override
    public void Action(Game game) {
        enemy.addShield(shield);
    }
}
