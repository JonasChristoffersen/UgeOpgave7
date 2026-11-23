import java.util.ArrayList;

public class Deck {
    private ArrayList<FlashCard> cards = new ArrayList<>();

    public void addCard(FlashCard fc) {
        this.cards.add(fc);
    }

    public void displayAllCards() {
        for (FlashCard fc : cards) {
            System.out.println(fc);
        }
    }

    public void displayNextCard(int cardCount) {
        System.out.println(cards.get(cardCount).getTerm());
    }

    public void displayDescription(int cardCount) {
        System.out.println(cards.get(cardCount).getDescription());
    }
}
