public class level3DelD {
    public void main() {
        //Del D: Switch vs if-else
        //Opgave 3.14: When to use switch
        /* Opgave: For hver af disse scenarios, beslut om switch eller if-else er bedst:
        1. Check if age > 18 = if statement
        2. Menu choice 1-5 = switch statement
        3. Day of week 1-7 = switch statement
        4. Check if (age > 18 && hasLicense) = if statement */

        //Opgave 3.15: Rewrite if-else as switch4
        System.out.println("Opgave 3.15: Rewrite if-else as switch");
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
        }

        //Opgave 3.16: Why NOT switch?
        // Kan IKKE laves til switch fordi:
        // 1. Vi checker et RANGE (18-64), ikke specifikke værdier
        // 2. Vi bruger && (complex condition)
        // 3. Switch kan kun check equality (==), ikke >= eller <
        System.out.println("Opgave 3.16: Why NOT switch?");
        int age = 25;
        if (age >= 18 && age < 65) {
            System.out.println("Working age");
        }

        //Opgave 3.17: Best choice
        System.out.println("Opgave 3.17: Best choice");
        int age2 = 25;
        int price;
        if (age2 >= 1 && age2 <= 12) {
            price = 50;
        } else if (age2 >= 13 && age2 <= 17) {
            price = 75;
        } else if (age2 >= 18 && age2 <= 64) {
            price = 100;
        } else {
            price = 60;
        }
        System.out.println("Price: " + price + " kr");
    }
}