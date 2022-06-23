package Game.Game;

import Game.Card.Card;
import Game.Card.Hit;
import Game.Card.Struck;

import java.io.FileNotFoundException;

public class StartGame {
    public static void startGame() throws FileNotFoundException {
        Game game = new Game();

        Card hit = new Hit();
        Card struck = new Struck();
        game.getHero().addCard(hit);
        game.getHero().addCard(struck);
        
        game.getLevels().get(5).levelStatus();

        game.getHero().getDeck().getCards().get(1).Effect(game.getLevels().get(5).enemies, game.getHero());

        game.getLevels().get(5).levelStatus();

        game.getHero().getDeck().getCards().get(0).Effect(game.getLevels().get(5).enemies, game.getHero());

        game.getLevels().get(5).levelStatus();
    }
}
