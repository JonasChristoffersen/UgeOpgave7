public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        FileIO io = new FileIO();
        TextUI ui = new TextUI();
        io.readData("data/flashcards.csv", deck);
        int cardCount = 0;
        boolean running = true;
        //deck.displayAllCards();

        while (running) {
            switch (ui.promptNumeric("""
                    
                    1) quit
                    2) Show flashcard
                    3) Show answer
                    """)) {
                case 1:
                    running = false;
                    break;
                case 2:
                    deck.displayNextCard(cardCount);
                    ui.promptText("Skriv forklaringen på term");
                    break;
                case 3:
                    deck.displayDescription(cardCount);
                    cardCount++;
                    break;
            }
        }
    }
}
