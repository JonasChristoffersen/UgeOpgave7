public class Level2DelB {
    public void main() {
        //Del B: OR Operator (||)
        //Opgave 2.6: Simple OR
        System.out.println("Opgave 2.6: Simple OR");
        int age = 10;
        if (age < 12 || age >= 65) {
            System.out.println("Discount");
        }

        //Opgave 2.7: Weekend check
        System.out.println("Opgave 2.7: Weekend check");
        String day = "Saturday";
        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }

        //Opgave 2.8: Emergency contact
        System.out.println("Opgave 2.8: Emergency contact");
        int temperature = 40;
        if (temperature > 39 || temperature < 35) {
            System.out.println("Call emergency");
        } else {
            System.out.println("Normal temperature");
        }

        //Opgave 2.9: Multiple valid inputs
        System.out.println("Opgave 2.9: Multiple valid inputs");
        String command = "start";
        if (command.equals("start") || command.equals("run") || command.equals("begin")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        //Opgave 2.10: Pass with retake
        System.out.println("Opgave 2.10: Pass with retake");
        int score = 55;
        boolean hasRetake = true;
        if (score >= 60 && hasRetake) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
