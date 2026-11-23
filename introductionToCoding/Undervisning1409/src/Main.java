import java.util.Scanner;

public class Main {
    String[] menuItems = {
            "Create post",
            "Delete post",
            "Like post",
            "Share post",
            "Save post",
            "Comment post",
            "Follow",
            "Exit"
    };

    int globalString;

    public void displayMenu() {
        int count = 0;
        for (int i = 0; i <= (menuItems.length - 1); i++) {
            count++;
            System.out.println(count + ". " + menuItems[i]);
        }
    }

    public void getUserInput() {
        Scanner userInput = new Scanner(System.in);
        //Read input from user
        //update a global variable with users choice
        globalString = userInput.nextInt();
    }

    public void main() {
        getUserInput();
        System.out.println(globalString);
        displayMenu();
    }
}
