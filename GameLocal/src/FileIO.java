import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    public ArrayList<String> readData(String path){
        File file = new File(path);
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//skip header
            while(scan.hasNextLine()){
                String s = scan.nextLine();// "Egon , 20000"
                String[] values = s.split(",");// ["Egon", " 20000"]
                data.add(values[0]);
                data.add(values[1]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("der findes kun 2 værdier pr. række");
        }
        return data;
    }

    public void saveData(ArrayList<String> data, String path, String header) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(header);
            for (String s : data) {
                writer.write("\n" + s);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}