import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public void readData(String path) {
        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); //Skip first header line in data file!
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] values = s.split(", ");
                String term = values[0];
                String description = values[1];
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
