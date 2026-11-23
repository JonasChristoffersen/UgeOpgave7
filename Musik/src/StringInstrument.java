public class StringInstrument extends AInstrument {
    public StringInstrument(String name) {
        super(name);
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Pling, pling");
    }

    public boolean distortionActive() {
        return true;
    }
}