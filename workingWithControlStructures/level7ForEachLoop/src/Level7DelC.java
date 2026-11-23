public class Level7DelC {
    public void main() {
        //Del C: Calculations with For-Each
        //Opgave 7.11: Sum array
        System.out.println("Opgave 7.11: Sum array");
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

        //Opgave 7.12: Average
        System.out.println("Opgave 7.12: Average");
        int[] numbers1 = {10, 20, 30, 40, 50};
        int sum1 = 0;
        int count = 0;
        for (int number : numbers1) {
            sum1 += number;
            count++;
        }
        double average = (double) sum1 / count;
        System.out.println("Average: " + average);

        //Opgave 7.13: Count positive numbers
        System.out.println("Opgave 7.13: Count positive numbers");
        int[] numbers2 = {-5, 10, -3, 8, 0, 15, -2};
        int count1 = 0;
        for (int number : numbers2) {
            if (number > 0) {
                count1++;
            }
        }
        System.out.println("Positive numbers: " + count1);

        //Opgave 7.14: Find maximum
        System.out.println("Opgave 7.14: Find maximum");
        int[] numbers3 = {23, 45, 12, 67, 34, 89, 21};
        int max = numbers[0];  // Initialize with first element
        for (int number : numbers3) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum: " + max);

        //Opgave 7.15: Product of all elements
        System.out.println("Opgave 7.15: Product of all elements");
        int[] numbers4 = {2, 3, 4, 5};
        int product = 1;
        for (int number : numbers4) {
            product *= number;
        }
        System.out.println("Product: " + product);
    }
}
