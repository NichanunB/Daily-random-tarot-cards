import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<TarotCard> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public void addCard(TarotCard card) {
        cards.add(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public TarotCard selectCard() {
        if (cards.isEmpty()) {
            System.out.println("No cards in the deck.");
            return null;
        }

        TarotCard selectedCard = cards.get(0);
        selectedCard.getImageBack();
        System.out.println("You selected a card!");
        selectedCard.reveal();
        return selectedCard;
    }
}
