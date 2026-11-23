import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game g = new Game("Yatzy", 4);
        File file = new File("data/players.csv");
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); //Skip first header line in data file!
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] values = s.split(",");
                String name = values[0];
                int score = Integer.parseInt(values[1].trim());
                Player p = new Player(name, score);
                g.addPlayer(p);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            g.registerPlayers();
        }

        System.out.println(g);
        g.runGameLoop();
        System.out.println(g);

        //After game is done:
        g.endGame();
    }
}
