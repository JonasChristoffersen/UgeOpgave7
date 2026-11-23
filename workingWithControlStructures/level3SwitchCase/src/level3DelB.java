public class level3DelB {
    public void main() {
        //Del B: Switch with Strings
        //Opgave 3.4: String switch
        System.out.println("Opgave 3.4: String switch");
        String command = "start";
        switch (command) {
            case "start":
                System.out.println("Starting system...");
                break;
            case "stop":
                System.out.println("Stopping system...");
                break;
            case "pause":
                System.out.println("Pausing system...");
                break;
            default:
                System.out.println("Unknown command!");
        }

        //Opgave 3.5: Case sensitivity
        System.out.println("Opgave 3.5: Case sensitivity");
        String command2 = "START";
        switch (command2) {
            case "start":
                System.out.println("Starting system...");
                break;
            case "stop":
                System.out.println("Stopping system...");
                break;
            case "pause":
                System.out.println("Pausing system...");
                break;
            default:
                System.out.println("Unknown command!");
        }

        //Opgave 3.6: Traffic light
        System.out.println("Opgave 3.6: Traffic light");
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Slow down");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color!");
        }

        //Opgave 3.7: Month names
        System.out.println("Opgave 3.7: Month names");
        String month = "March";
        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month!");
        }

        //Opgave 3.8: Calculator operation
        System.out.println("Opgave 3.8: Calculator operation");
        String operation = "add";
        int a = 10;
        int b  = 5;
        int result;
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            default:
                result = 0;
                System.out.println("Unknown operation");
        }
        System.out.println("Result: " + result);
    }
}
