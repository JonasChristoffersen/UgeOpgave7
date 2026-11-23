public class Level6DelC {
    public void main() {
        //Del C: Search and Find
        //Opgave 6.11: Find element
        System.out.println("Opgave 6.11: Find element");
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Found at index " + foundIndex);
        } else {
            System.out.println("Not found");
        }

        //Opgave 6.12: Contains check
        System.out.println("Opgave 6.12: Contains check");
        int[] numbers1 = {5, 10, 15, 20, 25};
        int target1 = 15;
        boolean found = false;
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == target1) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Array contains " + target1);
        } else {
            System.out.println("Array does not contain " + target1);
        }

        //Opgave 6.13: Find minimum
        System.out.println("Opgave 6.13: Find minimum");
        int[] numbers2 = {45, 12, 67, 23, 89, 8, 34};
        int min = numbers[0];  // Start with first element
        for (int i = 1; i < numbers2.length; i++) {
            if (numbers2[i] < min) {
                min = numbers2[i];
            }
        }
        System.out.println("Minimum: " + min);

        //Opgave 6.14: Find maximum
        System.out.println("Opgave 6.14: Find maximum");
        int[] numbers3 = {45, 12, 67, 23, 89, 8, 34};
        int max = numbers3[0];
        for (int i = 1; i < numbers3.length; i++) {
            if (numbers3[i] > max) {
                max = numbers3[i];
            }
        }
        System.out.println("Maximum: " + max);

        //Opgave 6.15: Find min and max
        System.out.println("Opgave 6.15: Find min and max");
        int[] numbers4 = {34, 78, 12, 56, 90, 23, 67};
        int min1 = numbers4[0];
        int max1 = numbers4[0];
        for (int i = 1; i < numbers4.length; i++) {
            if (numbers4[i] < min1) {
                min1 = numbers4[i];
            }
            if (numbers4[i] > max1) {
                max1 = numbers4[i];
            }
        }
        System.out.println("Min: " + min1);
        System.out.println("Max: " + max1);
        System.out.println("Range: " + (max1 - min1));
    }
}
