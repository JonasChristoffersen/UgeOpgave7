public class Level6DelE {
    public void main() {
        //Del E: Reverse Iteration
        //Opgave 6.21: Print backwards
        System.out.println("Opgave 6.21: Print backwards");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        //Opgave 6.22: Reverse sum
        System.out.println("Opgave 6.22: Reverse sum");
        int[] numbers1 = {5, 10, 15, 20};
        int sum = 0;
        for (int i = numbers1.length - 1; i >= 0; i--) {
            sum += numbers1[i];
            System.out.println("Adding " + numbers1[i] + ", sum = " + sum);
        }
        System.out.println("Total: " + sum);

        //Opgave 6.23: Find last occurrence
        System.out.println("Opgave 6.23: Find last occurrence");
        int[] numbers2 = {10, 20, 30, 20, 40};
        int target = 20;
        int foundIndex = -1;
        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (numbers2[i] == target) {
                foundIndex = i;
                break;  // Found last occurrence
            }
        }
        System.out.println("Last occurrence at index: " + foundIndex);

        //Opgave 6.24: Print alternating
        System.out.println("Opgave 6.24: Print alternating");
        int[] numbers3 = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = numbers3.length - 1;
        while (left <= right) {
            System.out.println(numbers3[left]);
            if (left != right) {
                System.out.println(numbers3[right]);
            }
            left++;
            right--;
        }

        //Opgave 6.25: Count from both ends
        System.out.println("Opgave 6.25: Count from both ends");
        int[] numbers4 = {5, 15, 25, 35, 45, 55};
        int countFromStart = 0;
        int countFromEnd = 0;
        for (int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] > 20) {
                countFromStart++;
            }
        }
        for (int i = numbers4.length - 1; i >= 0; i--) {
            if (numbers4[i] > 20) {
                countFromEnd++;
            }
        }
        System.out.println("From start: " + countFromStart);
        System.out.println("From end: " + countFromEnd);
    }
}
