public class level4DelC {
    public void main() {
        //Del C: Array Length
        //Opgave 4.11: Get array length
        System.out.println("Opgave 4.11: Get array length");
        String[] names = {"Anna", "Bob", "Carl", "Diana"};
        int count = names.length;
        System.out.println(count);

        //Opgave 4.12: Length property
        System.out.println("Opgave 4.12: Length property");
        int[] scores = {85, 92, 78};
        int scoreCount = scores.length;
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        int dayCount = days.length;
        double[] temps = {18.5, 22.0};
        int tempCount = temps.length;

        //Opgave 4.13: Last element using length
        System.out.println("Opgave 4.13: Last element using length");
        int[] numbers = {10, 20, 30, 40, 50};
        int lastNumber = numbers[numbers.length - 1];
        System.out.println(lastNumber);

        //Opgave 4.14: Length in calculation
        System.out.println("Opgave 4.14: Length in calculation");
        double[] prices = {15.50, 22.00, 8.75, 12.50};
        double total = prices[0] + prices[1] + prices[2] + prices[3];
        System.out.println(total);

        //Opgave 4.15: First and last
        System.out.println("Opgave 4.15: First and last");
        String[] months = {"January", "February", "March", "April", "May"};
        String firstMonth = months[0];
        String lastMonth = months[months.length - 1];
        System.out.println(firstMonth);
        System.out.println(lastMonth);

    }
}
