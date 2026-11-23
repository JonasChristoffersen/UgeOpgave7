public class Level5DelC {
    public void main() {
        //Del C: Accumulation with For
        //Opgave 5.9: Sum 1 to 100
        System.out.println("Opgave 5.9: Sum 1 to 100");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        //Opgave 5.10: Factorial
        System.out.println("Opgave 5.10: Factorial");
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("10! = " + factorial);

        //Opgave 5.11: Sum even numbers
        System.out.println("Opgave 5.11: Sum even numbers");
        int sum1 = 0;
        for (int i = 2; i <= 50; i += 2) {
            sum1 += i;
        }
        System.out.println(sum1);

        //Opgave 5.12: Count multiples
        System.out.println("Opgave 5.12: Count multiples");
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println(count);

        //Opgave 5.13: Average
        System.out.println("Opgave 5.13: Average");
        int sum2 = 0;
        int count1 = 0;
        for (int i = 1; i <= 20; i++) {
            sum2 += i;
            count1++;
        }
        double average = (double) sum2 / count1;
        System.out.println("Average: " + average);
    }
}
