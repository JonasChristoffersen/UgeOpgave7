public class Level5DelE {
    public void main() {
        //Del E: For vs While
        //Opgave 5.21: When to use for
        System.out.println("Opgave 5.21: When to use for");
        // For loop (bedre her!)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // While loop (fungerer, men for er mere naturligt)
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //Opgave 5.22: Convert while to for
        System.out.println("Opgave 5.22: Convert while to for");
        for (int i1 = 0; i < 20; i += 2) {
            System.out.println(i);
        }

        //Opgave 5.23: Sum comparison
        System.out.println("Opgave 5.23: Sum comparison");
        // For loop (compact)
        int sum1 = 0;
        for (int i2 = 1; i2 <= 50; i2++) {
            sum1 += i2;
        }
        // While loop (mere verbose)
        int sum2 = 0;
        int i3 = 1;
        while (i3 <= 50) {
            sum2 += i3;
            i3++;
        }
        System.out.println("Sum (for): " + sum1);
        System.out.println("Sum (while): " + sum2);
    }
}
