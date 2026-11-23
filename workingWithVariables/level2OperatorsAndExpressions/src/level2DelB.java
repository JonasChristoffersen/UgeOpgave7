public class level2DelB {
    public void main() {
        //Del B: Integer Division vs Decimal Division
        //Opgave 2.6: Integer division problem
        System.out.println("Opgave 2.6: Integer division problem");
        int numberOfCookies = 10;
        int friends = 3;
        int cookiesPerPerson = numberOfCookies / friends;
        System.out.println(cookiesPerPerson);

        //Opgave 2.7: Force decimal division
        System.out.println("Opgave 2.7: Force decimal division");
        int totalScore = 85;
        int numberOfTests = 4;
        double averageScore = (double) totalScore / numberOfTests;
        System.out.println(averageScore);

        //Opgave 2.8: Split bill fairly
        System.out.println("Opgave 2.8: Split bill fairly");
        double billAmount = 235.50;
        int friends2 = 4;
        double pricePerPerson = billAmount / friends2;
        System.out.println(pricePerPerson);

        //Opgave 2.9: Price per item
        System.out.println("Opgave 2.9: Price per item");
        double packagePrice = 49.90;
        int itemsInPackage = 6;
        double pricePerItem = packagePrice / itemsInPackage;
        System.out.println(pricePerItem);

        //Opgave 2.10: Division with object
        System.out.println("Opgave 2.10: Division with object");
        double billAmount2 = 500.0;
        int friends3 = 5;
        double splitBillAmount = billAmount2 / friends3;
        System.out.println(splitBillAmount);
    }
}
