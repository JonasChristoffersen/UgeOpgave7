public class level1DelC {
    public void main() {
        //Del C: if-else if-else Chains
        //Opgave 1.11: Letter grades
        System.out.println("Opgave 1.11: Letter grades");
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //Opgave 1.12: Flere karakterer
        System.out.println("Opgave 1.12: Flere karakterer");
        int score2 = 95;
        int score3 = 72;
        int score4 = 58;

        if (score2 >= 90) {
            System.out.println("A");
        } else if (score2 >= 80) {
            System.out.println("B");
        } else if (score2 >= 70) {
            System.out.println("C");
        } else if (score2 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (score3 >= 90) {
            System.out.println("A");
        } else if (score3 >= 80) {
            System.out.println("B");
        } else if (score3 >= 70) {
            System.out.println("C");
        } else if (score3 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (score4 >= 90) {
            System.out.println("A");
        } else if (score4 >= 80) {
            System.out.println("B");
        } else if (score4 >= 70) {
            System.out.println("C");
        } else if (score4 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //Opgave 1.13: Age categories
        System.out.println("Opgave 1.13: Age categories");
        int age = 70;
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("Teen");
        } else if (age < 65) {
            System.out.println("Adult");
        } else if (age >=65) {
            System.out.println("Senior");
        }

        //Opgave 1.14: Temperature ranges
        System.out.println("Opgave 1.14: Temperature ranges");
        int temp = 22;
        if (temp < 0) {
            System.out.println("Freezing");
        } else if (temp < 15) {
            System.out.println("Cold");
        } else if (temp < 25) {
            System.out.println("Comfortable");
        } else if (temp >= 25) {
            System.out.println("Hot");
        }

        //Opgave 1.15: Ticket pricing
        System.out.println("Opgave 1.15: Ticket pricing");
        int age2 = 25;
        int price;
        if (age2 < 12) {
            price = 50;
        } else if (age2 < 18) {
            price = 75;
        } else if (age2 < 65) {
            price = 100;
        } else {
            price = 65;
        }
        System.out.println("Price: " + price + "kr");

        //Opgave 1.16: Grade ranges
        System.out.println("Opgave 1.16: Grade ranges");
        int score5 = 88;
        String grade;
        if (score5 >= 90) {
            grade = "A";
        } else if (score5 >= 80) {
            grade = "B";
        } else if (score5 >= 70) {
            grade = "C";
        } else if (score5 >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}