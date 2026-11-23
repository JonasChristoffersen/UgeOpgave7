public class Level7DelB {
    public void main() {
        //Del B: For-Each with Strings
        //Opgave 7.6: Print all names
        System.out.println("Opgave 7.6: Print all names");
        String[] names = {"Anna", "Bob", "Carl", "Diana"};
        for (String name : names) {
            System.out.println(name);
        }

        //Opgave 7.7: Greet everyone
        System.out.println("Opgave 7.7: Greet everyone");
        String[] names2 = {"Alice", "Bob", "Charlie"};
        for (String name : names2) {
            System.out.println("Hello, " + name + "!");
        }

        //Opgave 7.8: Print lengths
        System.out.println("Opgave 7.8: Print lengths");
        String[] words = {"cat", "elephant", "dog", "butterfly"};
        for (String word : words) {
            System.out.println(word + " has " + word.length() + " letters");
        }

        //Opgave 7.9: Uppercase conversion
        System.out.println("Opgave 7.9: Uppercase conversion");
        String[] words1 = {"hello", "world", "java"};

        for (String word : words1) {
            System.out.println(word.toUpperCase());
        }

        //Opgave 7.10: First character
        System.out.println("Opgave 7.10: First character");
        String[] names3 = {"Anna", "Bob", "Carl"};
        for (String name : names3) {
            System.out.println(name.charAt(0));
        }
    }
}
