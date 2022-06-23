package Game.Card;

import Game.Character.Hero;
import Game.Enemy.Enemy;

import java.util.List;

public class Hit extends Card {
    public Hit() {
        this.setEnergy(1);
        this.setName("Hit");
    }

    @Override
    public void Effect(List<Enemy> enemies, Hero hero) {
        System.out.println("Use of the card : " + this.getName());
        hero.ChangeEnergy(this.getEnergy());
        enemies.get(0).changeHP(-7);
    }
}
