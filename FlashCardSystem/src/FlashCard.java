import java.security.PublicKey;

public class FlashCard {
    private String term;
    private String description;

    public FlashCard(String term, String description) {
        this.term = term;
        this.description = description;
    }


    @Override
    public String toString() {
        return this.term + " -->" + this.description;
    }

    public String getTerm() {
        return term;
    }

    public String getDescription() {
        return description;
    }


}
