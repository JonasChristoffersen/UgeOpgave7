import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();

        Instrument i1 = new StringInstrument("Guitar");
        Instrument i2 = new Brass("Post horn");
        Instrument i3 = new Perc("Conga");

        instruments.add(i1);
        instruments.add(i2);
        instruments.add(i3);

        for (Instrument i : instruments) {
            if (i instanceof Brass) {
                if (!stringInstrumentIsPlaying(instruments)) {
                    i.play();
                }
            } else {
                i.play();
            }
        }
    }

    public static boolean stringInstrumentIsPlaying(ArrayList<Instrument> instruments) {
        for (Instrument i : instruments) {
            if (i instanceof StringInstrument && i.isPlaying()) {
                return true;
            }
        }
        return false;
    }
}