public class Level4DelD {
    public void main() {
        //Del D: Sentinel Values
        //Opgave 4.14: Stop at -1
        System.out.println("Opgave 4.14: Stop at -1");
        int number = 10;
        while (number != -1) {
            System.out.println(number);
            number--;
            if (number == 5) {
                number = -1;
            }
        }

        //Opgave 4.15: Sum until zero
        System.out.println("Opgave 4.15: Sum until zero");
        int number2 = 100;
        int steps = 0;
        while (number2 > 0) {
            System.out.println(number2);
            number2 -= 7;
            steps++;
        }
        System.out.println("Steps: " + steps);

        //Opgave 4.16: Find square root
        System.out.println("Opgave 4.16: Find square root");
        int target = 64;
        int number3 = 1;
        boolean found = false;
        while (!found) {
            if (number3 * number3 == target) {
                found = true;
            } else {
                number3++;
            }
        }
        System.out.println("Square root of " + target + " is " + number3);

        //Opgave 4.17: Halve until small
        System.out.println("Opgave 4.17: Halve until small");
        int number1 = 1000;
        int steps1 = 0;
        while (number1 >= 10) {
            System.out.println(number1);
            number1 /= 2;
            steps1++;
        }
        System.out.println("Final: " + number1);
        System.out.println("Steps: " + steps1);

        //Opgave 4.18: Power of 2
        System.out.println("Opgave 4.18: Power of 2");
        int power = 1;
        int exponent = 0;
        while (power <= 1000) {
            power *= 2;
            exponent++;
        }
        System.out.println("2^" + exponent + " = " + power);
    }
}