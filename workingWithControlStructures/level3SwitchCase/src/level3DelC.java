public class level3DelC {
    public void main() {
        //Del C: Grouping Cases (Fall-Through)
        //Opgave 3.9: Weekend check
        System.out.println("Opgave 3.9: Weekend check");
        int day = 6;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        //Opgave 3.10: Vowel check
        System.out.println("Opgave 3.10: Vowel check");
        char ch = 'e';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

        //Opgave 3.11: Grade categories
        System.out.println("Opgave 3.11: Grade categories");
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
            case 'D':
                System.out.println("Average");
                break;
            case 'E':
            case 'F':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid grade");
        }

        //Opgave 3.12: Number categories
        System.out.println("Opgave 3.12: Number categories");
        int num = 5;
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("Low");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Medium");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("High");
                break;
            default:
                System.out.println("Out of range");
        }

        //Opgave 3.13: Days in month
        System.out.println("Opgave 3.13: Days in month");
        int month = 7;
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 0;
                System.out.println("Invalid month");
        }
        System.out.println("Days: " + days);
    }
}
