package variable;
import java.util.Scanner;

public class ScannerInput {
    public void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvad hedder du?");
        String name = input.nextLine();
        System.out.println("Hej " + name);
        System.out.println("Hvor gammel er du " + name + "?");
        int age = input.nextInt();
        int birthYear = 2026 - age;
        System.out.println("Du blev født i " + birthYear);
    }
}