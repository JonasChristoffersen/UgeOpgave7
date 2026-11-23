public class Level4DelE {
    public void main() {
        //Del E: Countdown and Conditions
        //Opgave 4.19: Countdown from 20
        System.out.println("Opgave 4.19: Countdown from 20");
        int i = 20;
        while (i > 0) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i--;
        }

        //Opgave 4.20: Stop on condition
        System.out.println("Opgave 4.20: Stop on condition");
        int sum = 0;
        int i1 = 1;
        int count = 0;
        while (sum <= 100) {
            sum += i1;
            count++;
            i1++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Added " + count + " numbers");

        //Opgave 4.21: Double until large
        System.out.println("Opgave 4.21: Double until large");
        int number = 1;
        int doublings = 0;
        while (number <= 1000) {
            number *= 2;
            doublings++;
        }
        System.out.println("Number: " + number);
        System.out.println("Doublings: " + doublings);

        //Opgave 4.22: Multiple conditions
        System.out.println("Opgave 4.22: Multiple conditions");
        int i2 = 0;
        while (i2 <= 50 && i2 * i2 <= 100) {
            i2++;
        }
        System.out.println("Stopped at i = " + i2);
        System.out.println("i squared = " + (i2 * i2));

        //Opgave 4.23: Fibonacci until limit
        System.out.println("Opgave 4.23: Fibonacci until limit");
        int a = 0;
        int b = 1;
        int count1 = 0;
        while (b <= 100) {
            System.out.println(b);
            int next = a + b;
            a = b;
            b = next;
            count1++;
        }
        System.out.println("Generated " + count1 + " numbers");
    }
}
