import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Game {
    private String name;
    private int maxPlayers;
    private ArrayList<Player> players = new ArrayList<>();
    private TextUI ui = new TextUI();


    public Game(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
        System.out.println("Welcome to " + name);
    }

    public void registerPlayers() {
        while (players.size() < maxPlayers) {
            Player p = new Player(ui.promptText("What is players name?"));
            players.add(p);
        }
    }

    public void addPlayer(Player p) {
        this.players.add(p);
    }

    @Override
    public String toString() {
        String s = this.name;
        for (Player p : players) {
            s += "\n" + p.toString();
        }
        return s;
    }

    public void runGameLoop() {
        //TODO: Add a while loop that manages rounds
        players.get(0).addScore(30);
        players.get(1).addScore(36);
        players.get(2).addScore(84);
        players.get(3).addScore(102);

        players.get(0).addScore(50);
        players.get(1).addScore(83);
        players.get(2).addScore(92);
        players.get(3).addScore(41);
    }

    public void endGame() {
        try {
            FileWriter writer = new FileWriter("data/players.csv");
            writer.write("Name, Score");
            for (Player p : players) {
                writer.write("\n" + p.getName() + ", " + p.getScore());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
