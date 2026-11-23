public class Level1DelA {
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void printWelcome() {
        System.out.println("Welcome to the program!"
                + "\n" + "Lets get started!"
        );
    }

    public void main() {
        //Del A: Understanding Methods
        //Opgave 1.1: Din første metode
        System.out.println("Opgave 1.1: Din første metode");
        sayHello();

        //Opgave 1.2: Kald metoden flere gange
        System.out.println("Opgave 1.2: Kald metoden flere gange");
        sayHello();
        sayHello();
        sayHello();

        //Opgave 1.3: Metode med flere linjen
        System.out.println("Opgave 1.3: Metode med flere linjer");
        printWelcome();

        //Opgave 1.4: Hvad sker der?
        System.out.println("Opgave 1.4: Hvad sker der?");
        //Koden printer følgende:
        //Before
        //Hi there!
        //After

        //Opgave 1.5: Metode der ikke kaldes
        System.out.println("Opgave 1.5: Metode der ikke kaldes");
        //Koden printer følgende:

        testing()
    }
}
