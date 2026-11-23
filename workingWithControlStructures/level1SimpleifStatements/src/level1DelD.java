public class level1DelD {
    public void main() {
        //Del D: String Comparison
        //Opgave 1.17: Password check
        System.out.println("Opgave 1.17: Password check");
        String password = "Secret123";
        if (password.equals("Secret123")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        //Opgave 1.18: Case sensitivity
        System.out.println("//Opgave 1.18: Case sensitivity");
        String word1 = "Hello";
        String word2 = "hello";
        if (word1.equals(word2)) {
            System.out.println("Match");
        } else {
            System.out.println("No match");
        }

        //Opgave 1.19: Multiple password attempts
        System.out.println("Opgave 1.19: Multiple password attempts");
        String correctPassword = "secret123";
        String attempt1 = "wrong";
        if (attempt1.equals(correctPassword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        String attempt2 = "Secret123";
        if (attempt2.equals(correctPassword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        String attempt3 = "secret123";
        if (attempt3.equals(correctPassword)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        //Opgave 1.20: Day of week
        System.out.println("Opgave 1.20: Day of week");
        String day = "Monday";
        if (day.equals("Sunday") || day.equals("Saturday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }

        //Opgave 1.21: Command processor
        System.out.println("Opgave 1.21: Command processor");
        String command = "start";
        if (command.equals("start")) {
            System.out.println("Starting...");
        } else if (command.equals("stop")) {
            System.out.println("Stopping...");
        } else if (command.equals("pause")) {
            System.out.println("Pausing..");
        } else {
            System.out.println("Unknown command");
        }
    }
}