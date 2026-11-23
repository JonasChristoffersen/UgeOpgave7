public class level1DelE {
    public void main() {
        //Del E: Boolean Variables
        //Opgave 1.22: Boolean flag
        boolean isActive = true;
        if (isActive) {
            System.out.println("System ON");
        } else {
            System.out.println("System OFF");
        }

        //Opgave 1.23: Combining conditions
        System.out.println("Opgave 1.23: Combining conditions");
        boolean hasLicense = true;
        int age = 19;
        if (age >= 18 && hasLicense) {
            System.out.println("Can drive");
        } else {
            System.out.println("Cannot drive");
        }

        //Opgave 1.24: Setting boolean based on condition
        System.out.println("Opgave 1.24: Setting boolean based on condition");
        int score = 75;
        boolean passed;
        if (score >= 60) {
            passed = true;
        } else {
            passed = false;
        }
        System.out.println("Passed: " + passed);
    }
}
