public class Level7DelD {
    public void main() {
        //Del D: For-Each vs Traditional For
        //Opgave 7.16: Same task, both ways
        System.out.println("Opgave 7.16: Same task, both ways");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Traditional for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("For-each:");
        for (int number : numbers) {
            System.out.println(number);
        }

        //Opgave 7.17: When for-each is better
        System.out.println("Opgave 7.17: When for-each is better");
        int[] numbers1 = {10, 20, 30, 40};
        int sum1 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            sum1 += numbers1[i];
        }
        int sum2 = 0;
        for (int number : numbers1) {
            sum2 += number;
        }
        System.out.println("Sum (traditional): " + sum1);
        System.out.println("Sum (for-each): " + sum2);

        //Opgave 7.18: When traditional for is needed
        System.out.println("Opgave 7.18: When traditional for is needed");
        int[] numbers2 = {100, 200, 300};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Index " + i + ": " + numbers2[i]);
        }

        //Opgave 7.19: Read-only limitation
        System.out.println("Opgave 7.19: Read-only limitation");
        int[] numbers3 = {5, 10, 15};
        System.out.println("Before:");
        for (int number : numbers3) {
            System.out.print(number + " ");
        }
        for (int number : numbers3) {
            number = number * 2;
        }
        System.out.println("\nAfter:");
        for (int number : numbers3) {
            System.out.print(number + " ");
        }

        //Opgave 7.20: Choose the right tool
        System.out.println("Opgave 7.20: Choose the right tool");
        int[] numbers4 = {10, 20, 30, 40, 50};
        // 1. Print all - for-each is better
        for (int number : numbers4) {
            System.out.println(number);
        }
        // 2. Modify array - MUST use traditional
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] *= 2;
        }
        // 3. Sum - for-each is better
        int sum = 0;
        for (int number : numbers4) {
            sum += number;
        }
        // 4. Print with index - MUST use traditional
        for (int i = 0; i < numbers4.length; i++) {
            System.out.println("Index " + i + ": " + numbers4[i]);
        }
        // 5. Find max - for-each is fine
        int max = numbers4[0];
        for (int number : numbers4) {
            if (number > max) max = number;
        }
    }
}
