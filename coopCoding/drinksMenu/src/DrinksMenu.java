import java.util.ArrayList;
import java.util.Scanner;

public class DrinksMenu {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> options = new ArrayList<>();
    static int menuCount = 1;
    static ArrayList<Integer> choices = new ArrayList<Integer>();
    static int choiceCount = 1;

    public static void main(String[] args) {
        options.add("Milk");
        options.add("Water");
        options.add("Apple juice");
        options.add("Orange juice");

        System.out.println("Hvor gammel er du?");
        String input = scan.nextLine();
        int age = Integer.parseInt(input);
        if (age >= 18) {
            options.add("Gin&Tonic");
            options.add("Vodka Redbull");
            options.add("Dark n' Stormy");
            options.add("Gin hash");
            options.add("Long island");
            options.add("Guiness");
        }

        for (String option : options) {
            System.out.println(menuCount + ". " + option);
            menuCount++;
        }

        System.out.println("\nHvor mange drinks vil du bestille?");
        String userInput = scan.nextLine();
        int numberOfDrinks = Integer.parseInt(userInput);

        while (choices.size() < numberOfDrinks){
            System.out.println("Vælg en drink fra listen. (Tast et tal)");
            int choice = scan.nextInt();
            choices.add(choice);
        }

        System.out.println("\nFølgende er blevet bestilt:");
        for (int choice : choices) {
            System.out.println(choiceCount + ". " + options.get(choice-1));
            choiceCount++;
        }


    }

    public void options() {

    }

}

//Vi skal lave en algoritme
//Det skal laves med array list - Vi ved ikke hvor mange index der skal være
//Der skal laves en scanner som spørger hvad kunden ønsker at bestille
//Den skal kunne håndterer flere valg i et andet array (Overvej arraylist da vi ikke kender index endnu)

//klasser vi skal bruge:
//Options
//Hvis du er over 18 skal følgende items blive vist: Spiritus? (Alt skal vises)
//Hvis du er under 18 skal følgende items blive vist: Mælk, kakao


//1: Bed brugeren om at indtaste sin alder
//2: Lav en arraylist, options, til valgmuligheder i en drinks menu
