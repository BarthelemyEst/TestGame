package Game.Character;

import Game.Card.Card;
import Game.Deck.Deck;
import Game.Enemy.Enemy;
import Game.Game.Game;
import Game.Game.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Hero {
    private String name;
    private Deck deck = new Deck();
    private List<Card> hand = new ArrayList<>();
    private int Energy;

    public void useCard(Integer cardNumber, Level level, List<Card> usableCards) {
        usableCards.get(cardNumber).Effect(level.getEnemies(), this);
        List<Enemy> toRemove = new ArrayList<>();
        for (Enemy enemy : level.getEnemies()) {
            if (enemy.getHP() <= 0) {
                toRemove.add(enemy);
            }
        }

        this.getDeck().getCards().add(this.hand.get(cardNumber));
        this.getHand().remove(this.getHand().get(cardNumber));
        level.getEnemies().removeAll(toRemove);
    }

    public void setEnergy(int energy) {
        Energy = energy;
    }

    public void ChangeEnergy(int Energy) {
        this.Energy -= Energy;
    }

    public void addCard(Card card) {
        this.deck.addCard(card);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public int getEnergy() {
        return Energy;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void beginRound(Integer round) {
        this.drawCards();
        this.Energy = 3 + round - 1;
    }

    public void drawCards() {
        while (this.hand.size() < 6) {
            Random random = new Random();
            int rand = random.nextInt(0, 13 - this.hand.size());
            this.hand.add(this.deck.getCards().get(rand));
            this.deck.getCards().remove(rand);
        }
    }

    public Hero() {
        this.setDeck(new Deck());
        drawCards();
    }

    public void heroStatus() {
        System.out.println(this.Energy);
    }

    public List<Card> usableCards() {
        List<Card> usableCards = new ArrayList<>();
        for (Card card : this.getHand()) {
            if (this.Energy - card.getEnergy() >= 0) {
                usableCards.add(card);
            }
        }
        return usableCards;
    }
}
