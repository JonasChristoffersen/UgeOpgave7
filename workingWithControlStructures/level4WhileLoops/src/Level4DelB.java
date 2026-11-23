public class Level4DelB {
    public void main() {
        //Del B: Counter Pattern
        //Opgave 4.4: Count iterations
        System.out.println("Opgave 4.4: Count iterations");
        int i = 0;
        while (i < 10) {
            i++;
        }
        System.out.println("Loop ran " + i + " times");

        //Opgave 4.5: Count even numbers
        System.out.println("Opgave 4.5: Count even numbers");
        int count = 0;
        int i1 = 1;
        while (i1 <= 20) {
            if (i1 % 2 == 0) {
                count++;
            }
            i1++;
        }
        System.out.println("Even numbers: " + count);

        //Opgave 4.6: Count multiples of 3
        System.out.println("Opgave 4.6: Count multiples of 3");
        int count1 = 0;
        int i2 = 1;
        while (i2 <= 30) {
            if (i2 % 3 == 0) {
                count1++;
            }
            i2++;
        }
        System.out.println("Multiples of 3: " + count1);

        //Opgave 4.7: Count digits
        System.out.println("Opgave 4.7: Count digits");
        int number = 12345;
        int count2 = 0;
        while (number > 0) {
            count2++;
            number = number / 10;
        }
        System.out.println("Digits: " + count2);

        //Opgave 4.8: Count down
        System.out.println("Opgave 4.8: Count down");
        int i3 = 10;
        int count3 = 0;
        while (i3 > 0) {
            System.out.println(i3);
            count3++;
            i3--;
        }
        System.out.println("Printed: " + count3 + " numbers");
    }
}
