public class level2DelD {
    public void main() {
        //Del D: Operator Precedence (Rækkefølge)
        //Opgave 2.16: Multiplication before addition
        System.out.println("Opgave 2.16: Multiplication before addition");
        int mathProblem1 = 5 + 3 * 2;
        int mathProblem2 = (5 + 3) * 2;
        System.out.println(mathProblem1);
        System.out.println(mathProblem2);

        //Opgave 2.17: Clear with parentheses
        System.out.println("Opgave 2.17: Clear with parentheses");
        int basePrice = 100;
        int amount = 3;
        int discount = 20;
        int totalPrice = (basePrice * amount) - discount;
        System.out.println(totalPrice);

        //Opgave 2.18: Average calculation
        System.out.println("Opgave 2.18: Average calculation");
        int testResult1 = 80;
        int testResult2 = 90;
        int testResult3 = 85;
        double averageTestResult = (testResult1 + testResult2 + testResult3) / 3.0;
        System.out.println(averageTestResult);

        //Opgave 2.19: Complex expression
        System.out.println("Opgave 2.19: Complex expression");
        int a = 10;
        int b = 5;
        int c = 2;
        int results = a + b * c - 4;
        System.out.println(results);

        //Opgave 2.20: Percentage calculation
        System.out.println("Opgave 2.20: Percentage calculation");
        double price = 200.0;
        double discount2 = 15.0;
        double discountAmount = price * (discount2 / 100);
        double finalPrice = price - discountAmount;
        System.out.println(finalPrice);


    }
}
