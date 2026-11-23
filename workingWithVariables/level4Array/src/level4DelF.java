public class level4DelF {
    public void main() {
        //Del F: Working with Arrays
        //Opgave 4.26: Shopping cart
        System.out.println("Opgave 4.26: Shopping cart");
        String[] items = {"Milk", "Bread", "Eggs"};
        double[] prices = {12.50, 15.00, 25.00};
        double total = prices[0] + prices[1] + prices[2];
        System.out.println("Items: " + items.length);
        System.out.println("Total: " + total);

        //Opgave 4.27: Student grades
        System.out.println("Opgave 4.27: Student grades");
        int[] grades = {85, 92, 78, 88};
        int sum = grades[0] + grades[1] + grades[2] + grades[3];
        double average = sum / 4.0;
        System.out.println("Number of exams: " + grades.length);
        System.out.println("Average: " + average);

        //Opgave 4.28: Temperature analysis
        System.out.println("Opgave 4.28: Temperature analysis");
        double[] temperatures = {18.5, 22.0, 24.5, 21.0, 19.5};
        double firstTemp = temperatures[0];
        double middleTemp = temperatures[2];
        double lastTemp = temperatures[temperatures.length - 1];
        System.out.println("First: " + firstTemp);
        System.out.println("Middle: " + middleTemp);
        System.out.println("Last: " + lastTemp);

        //Opgave 4.29: Product comparison
        System.out.println("Opgave 4.29: Product comparison");
        String[] products = {"Laptop", "Mouse", "Keyboard"};
        double[] prices2 = {7999.99, 249.99, 499.99};
        double cheapest = prices2[1];
        double mostExpensive = prices2[0];
        System.out.println("Cheapest: " + products[1] + " at " + cheapest);
        System.out.println("Most expensive: " + products[0] + " at " + mostExpensive);

        //Opgave 4.30: Complete data management
        String[] names = {"Anna", "Bob", "Carl", "Diana", "Eva"};
        int[] ages = {28, 35, 42, 30, 38};
        double[] salaries = {45000, 52000, 58000, 48000, 51000};
        boolean[] isFullTime = {true, true, false, true, true};
        int employeeCount = names.length;
        String firstName = names[0];
        String lastName = names[names.length - 1];
        int ageSum = ages[0] + ages[1] + ages[2];
        double avgAge = ageSum / 3.0;
        double totalSalary = salaries[0] + salaries[1] + salaries[2] + salaries[3] + salaries[4];
        System.out.println("Employees: " + employeeCount);
        System.out.println("First: " + firstName + ", Last: " + lastName);
        System.out.println("Avg age (first 3): " + avgAge);
        System.out.println("Total salary: " + totalSalary);
    }
}
