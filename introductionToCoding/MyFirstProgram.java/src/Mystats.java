public class Mystats {
    String name = "Jonas Christoffersen";
    int age = 24;
    int zipcode = 3400;
    boolean hasKids = false;
    String helloMessage = "Hello world";

    // JAVA vil altid forvente at der er en main metode
    void main(){
        // Hvis man ønsker at lave et "print" argument kan det skrives med variablen først, og derefter skrive "sout" og derefer trykke på "enter"
        System.out.println(name);
        System.out.println(age);
        System.out.println(zipcode);
        System.out.println(hasKids);
        sayHello(); // Dette er et metode kald!
    }

    void sayHello(){
        System.out.println(helloMessage);
    }
}