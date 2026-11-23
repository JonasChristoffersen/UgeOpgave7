public class Level2DelE {
    public void main() {
        //Del E: Complex Conditions
        //Opgave 2.21: Temperature comfort zone
        System.out.println("Opgave 2.21: Temperature comfort zone");
        int temp = 22;
        int humidity = 45;
        if ((temp >= 18 && temp <= 25) && (humidity >= 30 && humidity <= 60)) {
            System.out.println("Comfortable");
        } else {
            System.out.println("Uncomfortable");
        }

        //Opgave 2.22: Valid date ranges
        System.out.println("Opgave 2.22: Valid date ranges");
        int month = 6;
        int day = 15;
        int year = 2024;
        if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && (year > 1900)) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }

        //Opgave 2.23: Multiple criteria search
        System.out.println("Opgave 2.23: Multiple criteria search");
        double price = 299.0;
        String category = "Electronics";
        boolean inStock = true;
        if ((price >= 100 && price <= 500) && (category.equals("Electronics") || category.equals("Books")) && inStock ) {
            System.out.println("Match found");
        } else {
            System.out.println("No match");
        }

        //Opgave 2.24: Grade boundaries
        System.out.println("Opgave 2.24: Grade boundaries");
        int score = 75;
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);

        //Opgave 2.25: Complex validation
        System.out.println("Opgave 2.25: Complex validation");
        int length = 10;
        boolean hasUpper = true;
        boolean hasLower = true;
        boolean hasSpaces = false;
        if (length >= 8 && (hasUpper && hasLower) && !hasSpaces) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
