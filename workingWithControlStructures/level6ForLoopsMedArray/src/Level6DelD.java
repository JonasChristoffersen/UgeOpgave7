public class Level6DelD {
    public void main() {
        //Del D: Modifying Arrays
        //Opgave 6.16: Double all values
        int[] numbers = {5, 10, 15, 20};
        System.out.println("Before:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println("After:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //Opgave 6.17: Add constant
        System.out.println("Opgave 6.17: Add constant");
        int[] numbers1 = {10, 20, 30, 40};
        System.out.println("Before: ");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] += 5;
        }
        System.out.println("\nAfter: ");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();

        //Opgave 6.18: Set negatives to zero
        System.out.println("Opgave 6.18: Set negatives to zero");
        int[] numbers2 = {10, -5, 20, -15, 30};
        System.out.println("Before:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] < 0) {
                numbers2[i] = 0;
            }
        }
        System.out.println("\nAfter:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        //Opgave 6.19: Normalize to percentage
        System.out.println("Opgave 6.19: Normalize to percentage");
        int[] scores = {25, 50, 75, 100};
        double[] percentages = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            percentages[i] = scores[i] / 100.0;
        }
        System.out.println("Percentages:");
        for (int i = 0; i < percentages.length; i++) {
            System.out.println(percentages[i]);
        }

        //Opgave 6.20: Square all values
        System.out.println("Opgave 6.20: Square all values");
        int[] numbers3 = {2, 3, 4, 5};
        System.out.println("Before:");
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = numbers3[i] * numbers3[i];
        }
        System.out.println("\nAfter:");
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
    }
}
