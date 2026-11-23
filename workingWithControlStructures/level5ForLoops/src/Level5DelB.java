public class Level5DelB {
    public void main() {
        //Del B: Counting Patterns
        //Opgave 5.4: Count down
        System.out.println("Opgave 5.4: Count down");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Opgave 5.5: Even numbers
        System.out.println("Opgave 5.5: Even numbers");
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        //Opgave 5.6: Multiples of 5
        System.out.println("Opgave 5.6: Multiples of 5");
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }

        //Opgave 5.7: Odd numbers backward
        System.out.println("Opgave 5.7: Odd numbers backward");
        for (int i = 19; i >= 1; i -= 2) {
            System.out.println(i);
        }

        //Opgave 5.8: Powers of 2
        System.out.println("Opgave 5.8: Powers of 2");
        int power = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }
}
