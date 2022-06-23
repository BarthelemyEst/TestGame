package Game.Card;

import Game.Character.Hero;
import Game.Enemy.Enemy;

import java.util.List;

public class Struck extends Card{
    public Struck() {
        this.setEnergy(3);
        this.setName("Struck");
    }

    @Override
    public void Effect(List<Enemy> enemies, Hero hero) {
        System.out.println("Use of the card : " + this.getName());
        hero.ChangeEnergy(this.getEnergy());
        for (Enemy enemy : enemies) {
            enemy.changeHP(-12);
        }
    }
}
