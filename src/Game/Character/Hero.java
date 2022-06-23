package Game.Character;

import Game.Card.Card;
import Game.Deck.Deck;


public class Hero {
    private String name;
    private Deck deck = new Deck();
    private int Energy = 3;

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
}
