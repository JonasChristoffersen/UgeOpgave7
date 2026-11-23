public class Brass extends AInstrument {
    public Brass(String name) {
        super(name);
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Brass playing");
    }
}
