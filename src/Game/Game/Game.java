package Game.Game;

import Game.Character.Hero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static File monsterLevelsFile = new File("MonsterLevels.txt");
    private Hero hero;
    private List<Level> levels = new ArrayList<>();

    public Game() throws FileNotFoundException {
        this.hero = new Hero();
        Scanner scanner = new Scanner(monsterLevelsFile);
        Integer level = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.equals(level.toString())) {
                this.levels.add(Level.generateLevel(level, monsterLevelsFile));
                level += 1;
            }
        }
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public void gameStatus(Integer level) {
        this.getLevels().get(level).levelStatus();
        this.getHero().heroStatus();
    }
}
