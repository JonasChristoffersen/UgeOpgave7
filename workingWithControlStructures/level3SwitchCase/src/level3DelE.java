public class level3DelE {
    public void main() {
        //Del E: Complex Switch Logic
        //Opgave 3.18: Multi-value calculation
        System.out.println("Opgave 3.18: Multi-value calculation");
        int month = 5;
        String quarter;
        switch (month) {
            case 1:
            case 2:
            case 3:
                quarter = "Q1";
                break;
            case 4:
            case 5:
            case 6:
                quarter = "Q2";
                break;
            case 7:
            case 8:
            case 9:
                quarter = "Q3";
                break;
            case 10:
            case 11:
            case 12:
                quarter = "Q4";
                break;
            default:
                quarter = "Invalid";
        }
        System.out.println("Quarter: " + quarter);

        //Opgave 3.19: Grade points
        System.out.println("Opgave 3.19: Grade points");
        char grade = 'B';
        int points;
        switch (grade) {
            case 'A':
                points = 12;
                break;
            case 'B':
                points = 10;
                break;
            case 'C':
                points = 7;
                break;
            case 'D':
                points = 4;
                break;
            case 'F':
                points = 0;
                break;
            default:
                points = -1;
                System.out.println("Invalid grade");
        }
        if (points >= 0) {
            System.out.println("Points: " + points);
        }

        //Opgave 3.20: Nested logic with switch
        System.out.println("Opgave 3.20: Nested logic with switch");
        String category = "fruit";
        String item = "apple";
        String description;
        switch (category) {
            case "fruit":
                if (item.equals("apple")) {
                    description = "Red apple";
                } else if (item.equals("banana")) {
                    description = "Yellow banana";
                } else {
                    description = "Unknown fruit";
                }
                break;
            case "vegetable":
                if (item.equals("carrot")) {
                    description = "Orange carrot";
                } else {
                    description = "Unknown vegetable";
                }
                break;
            default:
                description = "Unknown category";
        }
        System.out.println(description);

        //Opgave 3.21: Switch with calculation
        System.out.println("Opgave 3.21: Switch with calculation");
        int a = 15;
        int b = 3;
        String operation = "divide";
        double result;
        boolean validOperation = true;
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
                if (b != 0) {
                    result = (double) a / b;
                } else {
                    result = 0;
                    System.out.println("Error: Division by zero");
                    validOperation = false;
                }
                break;
            default:
                result = 0;
                System.out.println("Unknown operation");
                validOperation = false;
        }
        if (validOperation) {
            System.out.println(a + " " + operation + " " + b + " = " + result);
        }

        //Opgave 3.22: Work schedule
        System.out.println("Opgave 3.22: Work schedule");
        int day = 3;
        int workHours;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
                workHours = 8;
                break;
            case 5:
                workHours = 6;
                break;
            case 6:
            case 7:
                workHours = 0;
                break;
            default:
                workHours = 0;
                System.out.println("Invalid day");
        }
        System.out.println("Work hours: " + workHours);
    }
}
