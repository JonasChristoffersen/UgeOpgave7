public class Level2DelC {
    public void main() {
        //Del C: NOT Operator (!)
        //Opgave 2.11: Simple NOT
        System.out.println("Opgave 2.11: Simple NOT");
        boolean isActive = false;
        if (!isActive) {
            System.out.println("Inactive");
        }

        //Opgave 2.12: Double negative
        System.out.println("Opgave 2.12: Double negative");
        boolean isNotReady = false;
        if (!isNotReady) {
            System.out.println("Is ready");
        }

        //Opgave 2.13: Access denied
        System.out.println("Opgave 2.13: Access denied");
        boolean hasPermission = false;
        if (!hasPermission) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }

        //Opgave 2.14: NOT with AND
        System.out.println("Opgave 2.14: NOT with AND");
        int age = 20;
        boolean hasID = false;
        if (age >= 18 && !hasID) {
            System.out.println("Entry denied - need ID");
        }

        //Opgave 2.15: System status
        System.out.println("Opgave 2.15: System status");
        boolean isRunning = true;
        boolean hasErrors = false;
        if (isRunning && !hasErrors) {
            System.out.println("System OK");
        } else {
            System.out.println("System issue");
        }


    }
}
