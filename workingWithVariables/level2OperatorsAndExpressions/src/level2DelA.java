public class level2DelA {
    public void main(){
        //Del A: Basic Arithmetic (+, -, *, /)
        //Opgave 2.1: Addition - Sammenlægning
        System.out.println("Opgave 2.1: Addition - Sammenlægning");
        int myMoney = 50;
        int friendMoney = 30;
        int totalMoney = myMoney + friendMoney;
        System.out.println(totalMoney);

        //Opgave 2.2: Subtraction - Penge tilbage
        System.out.println("Opgave 2.2: Subtraction - Penge tilbage");
        int myMoney2 = 200;
        int costOfCoffee = 35;
        int moneyAfterPurchase = myMoney2 - costOfCoffee;
        System.out.println(moneyAfterPurchase);

        //Opgave 2.3: Multiplication - Køb flere
        System.out.println("Opgave 2.3: Multiplication - Køb flere");
        int priceOfCookie = 12;
        int numberOfCookies = 5;
        int totalPriceOfCookies = priceOfCookie * numberOfCookies;
        System.out.println(totalPriceOfCookies);

        //Opgave 2.4: Division - Dele lige
        System.out.println("Opgave 2.4: Division - Dele lige");
        int numberOfPizzaSlices = 12;
        int friends = 3;
        int slicesPerPerson = numberOfPizzaSlices / friends;
        System.out.println(slicesPerPerson);

        //Opgave 2.5: All operators - Restaurant regning
        System.out.println("Opgave 2.5: All operators - Restaurant regning");
        int burger = 75;
        int fries = 25;
        int soda = 30;
        int menuPrice = burger + fries + soda;
        int customerPaymentAmount = 200;
        int changeAfterPayment = customerPaymentAmount - menuPrice;
        System.out.println(menuPrice);
        System.out.println(changeAfterPayment);
    }
}
