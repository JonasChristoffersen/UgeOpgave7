public class Level6DelB {
    public void main() {
        //Del B: Array Calculations
        //Opgave 6.6: Sum array elements
        System.out.println("Opgave 6.6: Sum array elements");
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        //Opgave 6.7: Average
        System.out.println("Opgave 6.7: Average");
        int[] scores = {85, 92, 78, 88, 95};
        int sum1 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
        }
        double average = (double) sum1 / scores.length;
        System.out.println("Average: " + average);

        //Opgave 6.8: Count even numbers
        System.out.println("Opgave 6.8: Count even numbers");
        int[] numbers1 = {3, 8, 12, 5, 20, 7, 14};
        int count = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers: " + count);

        //Opgave 6.9: Count above threshold
        System.out.println("Opgave 6.9: Count above threshold");
        int[] numbers2 = {45, 67, 23, 89, 12, 56, 78};
        int count1 = 0;
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > 50) {
                count1++;
            }
        }
        System.out.println("Numbers above 50: " + count1);

        //Opgave 6.10: Sum and count
        System.out.println("Opgave 6.10: Sum and count");
        int[] numbers3 = {10, 25, 5, 30, 15, 20};
        int sum2 = 0;
        int count2 = 0;
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] >= 20) {
                sum2 += numbers3[i];
                count2++;
            }
        }
        System.out.println("Count: " + count2);
        System.out.println("Sum: " + sum2);
    }
}
