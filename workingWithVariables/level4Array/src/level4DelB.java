public class level4DelB {
    public void main() {
        //Del B: Accessing Elements
        //Opgave 4.6: Access first element
        System.out.println("Opgave 4.6: Access first element");
        int[] scores = {85, 92, 78, 88};
        int firstSore = scores[0];

        //Opgave 4.7: Access specific elements
        System.out.println("Opgave 4.7: Access specific elements");
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        String secondColor = colors[1];
        String fourthColor = colors[3];

        //Opgave 4.8: Access and use
        System.out.println("Opgave 4.8: Access and use");
        double[] prices = {15.50, 22.00, 8.75};
        double firstPrice = prices[0];
        double secondPrice = prices[1];
        double sumOfPrices = firstPrice + secondPrice;

        //Opgave 4.9: Multiple accesses
        System.out.println("Opgave 4.9: Multiple accesses");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);

        //Opgave 4.10: Access for calculation
        System.out.println("Opgave 4.10: Access for calculation");
        int[] ages = {25, 30, 22, 35, 28};
        int sum = ages[0] + ages[1] + ages[2];
        double average = sum / 3.0;
        System.out.println(average);
    }
}
