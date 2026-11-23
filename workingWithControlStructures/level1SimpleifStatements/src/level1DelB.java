public class level1DelB {
    public void main() {
        //Del B: if-else Statements
        //Opgave 1.4: Pass or fail
        System.out.println("Opgave 1.4: Pass or fail");
        int score = 55;
        if (score >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //Opgave 1.5: Adult or minor
        System.out.println("Opgave 1.5: Adult or minor");
        int age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        //Opgave 1.6: Positive or negative
        System.out.println("Opgave 1.6: Positive or negative");
        int number2 = -5;
        if (number2 > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Not positive");
        }

        //Opgave 1.7: Even or odd
        System.out.println("Opgave 1.7: Even or odd");
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //Opgave 1.8: Price discount
        System.out.println("Opgave 1.8: Price discount");
        double price = 600.0;
        if (price > 500) {
            System.out.println("Discount available");
        } else {
            System.out.println("No discount");
        }

        //Opgave 1.9: Stock availability
        System.out.println("Opgave 1.9: Stock availability");
        int stock = 0;
        if (stock > 0) {
            System.out.println("Available");
        } else {
            System.out.println("Out of stock");
        }

        //Opgave 1.10: Speed limit
        System.out.println("Opgave 1.10: Speed limit");
        int speed = 135;
        if (speed > 130) {
            System.out.println("Speeding!");
        } else {
            System.out.println("Within limit");
        }
    }
}