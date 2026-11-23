import java.util.Scanner;

public class scannerTavleOpgave {
    public void main() {
//        Scanner keyboardInput = new Scanner(System.in);
//
//        String firstMessage = "How old are you?";
//        System.out.println(firstMessage);
//
//        int age = keyboardInput.nextInt();
//
//        if (age >= 18) {
//            System.out.println("You are " + age + " years old.");
//            System.out.println("You can buy a ticket");
//        } else {
//            System.out.println("You are " + age + " years old.");
//            System.out.println("You cant buy a ticket");
//        }

        //Din tur: hvordan er vejret i dag?
        int temperature;
        Scanner tempInput = new Scanner(System.in);

        System.out.println("Hvad er temperaturen i dag?");
        temperature = tempInput.nextInt();

        if (temperature < 0) {
            System.out.println("Frostvejr");
        } else if (temperature >= 0 && temperature <= 25) {
            System.out.println("Normalt vejr");
        } else {
            System.out.println("Varmt");
        }
    }
}
