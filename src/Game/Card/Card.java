package Game.Card;

import Game.Character.Hero;
import Game.Enemy.Enemy;

import java.util.List;

public class Card {
    private String name;
    private int Energy;

    public int getEnergy() {
        return Energy;
    }
    public void Effect(List<Enemy> enemies, Hero hero){
    }

    public void setEnergy(int Energy) {
        this.Energy = Energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
