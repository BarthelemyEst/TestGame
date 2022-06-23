package Game.Deck;

import Game.Card.Card;
import Game.Card.Hit;
import Game.Card.Struck;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Deck() {
        this.addCard(new Hit());
        this.addCard(new Struck());
        this.addCard(new Hit());
        this.addCard(new Struck());
        this.addCard(new Hit());
        this.addCard(new Struck());
        this.addCard(new Hit());
        this.addCard(new Struck());
        this.addCard(new Hit());
        this.addCard(new Struck());
        this.addCard(new Hit());
        this.addCard(new Struck());
        this.addCard(new Hit());
        this.addCard(new Struck());
    }
}
