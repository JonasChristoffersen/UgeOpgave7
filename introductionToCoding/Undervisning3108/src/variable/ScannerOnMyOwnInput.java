package variable;

import java.util.Scanner;

public class ScannerOnMyOwnInput {
    public void main() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hej, hvad hedder du?");
        String name = userInput.nextLine();
        System.out.println("Hej " + name + ", jeg håber ud har en god dag");
        System.out.println("Hvad skal lave idag, når du har fri fra skole?");
        String todoToday = userInput.nextLine();
        System.out.println("Fedt! Så du skal: " + todoToday);

        System.out.println("Er dette korrekt? Hvis ja tast y - Hvis nej tast n");


    }
}
