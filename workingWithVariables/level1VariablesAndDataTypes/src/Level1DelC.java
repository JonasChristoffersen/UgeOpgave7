public class Level1DelC {
    public void main() {
        //Del C: Working with double
        //Opgave 1.11: Double operations
        System.out.println("Opgave 1.11: Double operations");
        double price = 19.99;
        System.out.println(price);
        price = 24.99;
        System.out.println(price);

        //Opgave 1.12: Flere double variabler
        System.out.println("Opgave 1.12: Flere double variabler");
        double height = 1.75;
        double weight = 68.5;
        double temperature = 36.6;
        System.out.println(height);
        System.out.println(weight);
        System.out.println(temperature);

        //Opgave 1.13: Int to double
        System.out.println("Opgave 1.13: Int to double");
        int wholeNumber = 10;
        double decimalNumber = wholeNumber;
        System.out.println(decimalNumber);

        //Opgave 1.14: Double til int (casting)
        System.out.println("Opgave 1.14: Double til int (casting)");
        double price2 = 19.99;
        int roundPrice2 = (int) price2;
        System.out.println(price2);
        System.out.println(roundPrice2);

        //Opgave 1.15: Precision loss
        System.out.println("Opgave 1.14: Double til int (casting)");
        double exactValue = 99.99;
        int wholeValue = (int) exactValue;
        System.out.println(exactValue);
        System.out.println(wholeValue);
    }
}