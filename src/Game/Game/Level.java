package Game.Game;

import Game.Enemy.Enemy;
import Game.Enemy.Orc;
import Game.Enemy.Rat;
import Game.Enemy.Spider;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Level {
    List<Enemy> enemies = new ArrayList<>();

    public static Level generateLevel(Integer level, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        Level currentLevel = new Level();

        while (!scanner.nextLine().equals(level.toString())) {
        }

        Enemy firstEnemy = generateEnemyFromName(scanner.nextLine());
        Enemy secondEnemy = generateEnemyFromName(scanner.nextLine());
        Enemy thirdEnemy = generateEnemyFromName(scanner.nextLine());

        currentLevel.enemies = setEnemies(Arrays.asList(firstEnemy, secondEnemy, thirdEnemy));

        return currentLevel;
    }

    public static Enemy generateEnemyFromName(String name) {
        Enemy enemy;
        switch (name) {
            case "Rat":
                enemy = new Rat();
                break;
            case "Spider":
                enemy = new Spider();
                break;
            case "Orc":
                enemy = new Orc();
                break;
            default:
                enemy = null;
        }
        return enemy;
    }

    public static List<Enemy> setEnemies(List<Enemy> enemies) {
        List<Enemy> levelEnemies = new ArrayList<>();
        for (Enemy enemy : enemies) {
            if (enemy != null) {
                levelEnemies.add(enemy);
            }
        }
        return levelEnemies;
    }

    public void levelStatus() {
        if (!this.enemies.isEmpty()) {
            for (Enemy enemy : this.enemies) {
                System.out.println(enemy.getName() + " : " + enemy.getHP());
            }
        }
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public boolean isLevelFinished(Game game) {
        if (game.getHero().getHP() <= 0) {
            return true;
        }
        for (Enemy enemy : this.enemies) {
            if (enemy.getHP() > 0) {
                return false;
            }
        }
        return true;
    }
}
