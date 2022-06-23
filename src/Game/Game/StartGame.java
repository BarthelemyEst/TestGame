package Game.Game;


import Game.Enemy.Enemy;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class StartGame {
    public static void startGame() throws FileNotFoundException {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        Integer level = 5;
        boolean skip = false;
        int Round = 1;
        while (!game.getLevels().get(level).isLevelFinished(game)) {
            game.getHero().beginRound(Round);
            System.out.println(game.getHero().getHand());
            skip = false;
            while (!skip) {
                game.gameStatus(level);
                Integer actionToPerform;
                System.out.println("What do you want to do : ");
                System.out.println("1 : Use Card");
                System.out.println("2 : Skip turn");
                System.out.println(game.getHero().usableCards());
                actionToPerform = scanner.nextInt();
                switch (actionToPerform) {
                    case 1:
                        System.out.println("which card do you want to use ?");
                        Integer cardToUse = scanner.nextInt();
                        game.getHero().useCard(cardToUse, game.getLevels().get(level), game.getHero().usableCards());
                        break;
                    case 2:
                        skip = true;
                        Round += 1;
                        break;
                    default:
                        System.out.println("error, chose 1 or 2");
                }
            }
            for (Enemy enemy : game.getLevels().get(level).getEnemies()) {
                Random random = new Random();
                int Atk = random.nextInt(0, enemy.getMoves().size());
                System.out.println("Atk de : " + enemy.getName() + " est : " + Atk);
                enemy.getMoves().get(Atk).Action(game);
            }
        }
    }
}
