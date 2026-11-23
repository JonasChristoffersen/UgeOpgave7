public class Level7DelE {
    public void main() {
        //Del E: When NOT to Use For-Each
        //Opgave 7.21: Partial iteration
        System.out.println("Opgave 7.21: Partial iteration");
        int[] numbers = {10, 20, 30, 40, 50, 60};
        // Cannot do with for-each - must use traditional
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }

        //Opgave 7.22: Backwards iteration
        System.out.println("Opgave 7.22: Backwards iteration");
        int[] numbers1 = {1, 2, 3, 4, 5};
        // Cannot do backwards with for-each - must use traditional
        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.println(numbers1[i]);
        }

        //Opgave 7.23: Every other element
        System.out.println("Opgave 7.23: Every other element");
        int[] numbers2 = {10, 20, 30, 40, 50, 60};
        // Must use traditional - need control over step
        for (int i = 0; i < numbers2.length; i += 2) {
            System.out.println(numbers2[i]);
        }

        //Opgave 7.24: Comparing adjacent elements
        System.out.println("Opgave 7.24: Comparing adjacent elements");
        int[] numbers3 = {5, 3, 8, 2, 9};
        int count = 0;
        // Must use traditional - need to compare i and i+1
        for (int i = 0; i < numbers3.length - 1; i++) {
            if (numbers3[i] > numbers3[i + 1]) {
                count++;
            }
        }
        System.out.println("Count: " + count);

        //Opgave 7.25: Find index of element
        System.out.println("Opgave 7.25: Find index of element");
        int[] numbers4 = {10, 20, 30, 40, 50};
        int target = 30;
        int foundIndex = -1;
        // Must use traditional - need index
        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Found at index: " + foundIndex);
    }
}
