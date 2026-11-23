public class Level4DelC {
    public void main() {
        //Del C: Accumulator Pattern
        //Opgave 4.9: Sum 1 to 10
        System.out.println("Opgave 4.9: Sum 1 to 10");
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);

        //Opgave 4.10: Sum even numbers
        System.out.println("Opgave 4.10: Sum even numbers");
        int sum1 = 0;
        int i1 = 1;
        while (i1 <= 20) {
            if (i1 % 2 == 0) {
                sum1 += i1;
            }
            i1++;
        }
        System.out.println("Sum of even numbers: " + sum1);

        //Opgave 4.11: Product/factorial
        System.out.println("Opgave 4.11: Product/factorial");
        int product = 1;
        int i2 = 5;
        while (i2 > 0) {
            product *= i2;
            i2--;
        }
        System.out.println("5! = " + product);

        //Opgave 4.12: Sum and count
        System.out.println("Opgave 4.12: Sum and count");
        int sum2 = 0;
        int count = 0;
        int i3 = 1;
        while (i3 <= 100) {
            if (i3 % 7 == 0) {
                sum2 += i3;
                count++;
            }
            i3++;
        }
        System.out.println("count: " + count);
        System.out.println("Sum: " + sum2);

        //Opgave 4.13: Average
        System.out.println("Opgave 4.13: Average");
        int sum3 = 0;
        int count1 = 0;
        int i4 = 10;
        while (i4 <= 50) {
            sum3 += i4;
            count1++;
            i4 += 10;
        }
        double average = (double) sum3 / count1;
        System.out.println("Sum: " + sum3);
        System.out.println("Count: " + count1);
        System.out.println("Average: " + average);
    }
}
