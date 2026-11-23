public class Level7DelA {
    public void main() {
        //Del A: Basic For-Each
        //Opgave 7.1: Dit første for-each loop
        System.out.println("Opgave 7.1: Dit første for-each loop");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }

        //Opgave 7.2: Print on one line
        System.out.println("Opgave 7.2: Print on one line");
        int[] numbers1 = {1, 2, 3, 4, 5};
        for (int number : numbers1) {
            System.out.print(number + " ");
        }
        System.out.println();

        //Opgave 7.3: Double each value (display only)
        System.out.println("Opgave 7.3: Double each value (display only)");
        int[] numbers2 = {5, 10, 15, 20};
        for (int number : numbers2) {
            System.out.println(number * 2);
        }

        //Opgave 7.4: Print with labels
        System.out.println("Opgave 7.4: Print with labels");
        int[] numbers3 = {100, 200, 300};
        for (int number : numbers3) {
            System.out.println("Value: " + number);
        }

        //Opgave 7.5: Print squares
        System.out.println("Opgave 7.5: Print squares");
        int[] numbers4 = {2, 3, 4, 5};
        for (int number : numbers4) {
            int square = number * number;
            System.out.println(number + " squared = " + square);
        }
    }
}
