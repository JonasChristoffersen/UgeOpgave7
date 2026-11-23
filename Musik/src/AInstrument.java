abstract public class AInstrument implements Instrument {
    protected boolean isPlaying = false;
    private String name;

    public AInstrument(String name) {
        this.name = name;
    }

    @Override
    public boolean isPlaying() {
        return isPlaying;
    }
}