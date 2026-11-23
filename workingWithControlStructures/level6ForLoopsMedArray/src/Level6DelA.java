public class Level6DelA {
    public void main() {
        //Del A: Basic Array Iteration
        //Opgave 6.1: Print array elements
        System.out.println("Opgave 6.1: Print array elements");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Opgave 6.2: Print with index
        System.out.println("Opgave 6.2: Print with index");
        int[] numbers1 = {5, 10, 15, 20};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Index " + i + ": " + numbers1[i]);
        }

        //Opgave 6.3: String array iteration
        System.out.println("Opgave 6.3: String array iteration");
        String[] names = {"Anna", "Bob", "Carl", "Diana"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //Opgave 6.4: Double array iteration
        System.out.println("Opgave 6.4: Double array iteration");
        double[] prices = {12.5, 8.75, 15.0, 22.25};
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " kr.");
        }

        //Opgave 6.5: Array length
        System.out.println("Opgave 6.5: Array length");
        int[] number = {2, 4, 6, 8, 10, 12};
        System.out.println("Array length: " + number.length);
        System.out.println("Elements:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }


    }
}
