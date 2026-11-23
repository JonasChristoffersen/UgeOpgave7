public class Perc extends AInstrument{
    public Perc(String name) {
        super(name);
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Perc playing");
    }
}