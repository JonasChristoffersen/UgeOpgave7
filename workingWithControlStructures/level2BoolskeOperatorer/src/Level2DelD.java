public class Level2DelD {
    public void main() {
        //Del D: Combining Operators
        //Opgave 2.16: AND + OR together
        System.out.println("Opgave 2.16: AND + OR together");
        int score = 85;
        boolean hasAttendance = true;
        if (score >= 90 || (score >= 80 && hasAttendance)) {
            System.out.println("Bonus awarded");
        } else {
            System.out.println("No bonus");
        }

        //Opgave 2.17: Complex eligibility
        System.out.println("Opgave 2.17: Complex eligibility");
        int age = 30;
        boolean hasLicense = false;
        boolean hasPermit = true;
        if ((age >= 18 && age < 65) && (hasPermit || hasLicense)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        //Opgave 2.18: Discount logic
        System.out.println("Opgave 2.18: Discount logic");
        boolean isMember = false;
        double purchaseAmount = 600.0;
        boolean blacklisted = false;
        if ((isMember || purchaseAmount > 500) && !blacklisted) {
            System.out.println("Discount available");
        } else {
            System.out.println("No discount");
        }

        //Opgave 2.19: Login validation
        System.out.println("Opgave 2.19: Login validation");
        boolean correctPassword = true;
        boolean accountActive = false;
        boolean isAdmin = false;
        if ((correctPassword && accountActive) || isAdmin) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        //Opgave 2.20: Priority access
        System.out.println("Opgave 2.20: Priority access");
        boolean isVIP = false;
        boolean isMember2 = true;
        int points = 1200;
        boolean suspended = false;
        if (isVIP || (isMember2 && points > 1000) && !suspended) {
            System.out.println("Priority access");
        } else {
            System.out.println("Standard access");
        }
    }
}
