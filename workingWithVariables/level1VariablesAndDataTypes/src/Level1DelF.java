public class Level1DelF {
    public void main() {
        //Del F: Working with String
        //Opgave 1.26: String basics
        System.out.println("Opgave 1.26: String basics");
        String name = "Anna";
        System.out.println(name);

        //Opgave 1.27: String reassignment
        System.out.println("Opgave 1.27: String reassignment");
        String city = "Copenhagen";
        System.out.println(city);
        city = "Aarhus";
        System.out.println(city);

        //Opgave 1.28: Multiple Strings
        System.out.println("Opgave 1.28: Multiple Strings");
        String firstName = "Anna";
        String lastName = "Jensen";
        String county = "Denmark";
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(county);

        //Opgave 1.29: Tom String
        System.out.println("Opgave 1.29: Tom String");
        String emptyText = "";
        String greeting = "Hello";
        System.out.println(emptyText);
        System.out.println(greeting);

        //Opgave 1.30: String med tal
        System.out.println("Opgave 1.30: String med tal");
        String phoneNumber = "12345678";
        String zipCode = "2100";
        System.out.println(phoneNumber);
        System.out.println(zipCode);

        //Opgave 1.31: String med mellemrum og tegn
        System.out.println("Opgave 1.31: String med mellemrum og tegn");
        String sentence = "Hello, world!";
        String address = "Main Street 42";
        System.out.println(sentence);
        System.out.println(address);

        //Opgave 1.32: String length, charAt og indexOf
        System.out.println("Opgave 1.32: String length, charAt og indexOf");
        String word = "Hello";
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(4));
        System.out.println(word.indexOf('e'));
    }
}
