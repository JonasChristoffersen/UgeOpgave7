public class level2DelE {
    public void main() {
        //Del E: String Concatenation
        //Opgave 2.21: Combine strings (Opgave 2.1: Combine strings)
        System.out.println("Opgave 2.21: Combine strings");
        String firstName = "Jonas";
        String lastName = "Christoffersen";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        //Opgave 2.22: String + number
        System.out.println("Opgave 2.22: String + number");
        int age = 24;
        String message = "Your are "+age+" years old";
        System.out.println(message);

        //Opgave 2.23: Build address
        System.out.println("Opgave 2.23: Build address");
        String streetName = "Laurbærvænget";
        String houseNumber = "16 3th,";
        int zipcode = 3400;
        String city = "Hillerød";
        String message2 = streetName+" "+houseNumber+" "+zipcode+", "+city;
        System.out.println(message2);

        //Opgave 2.24: Watch order of operations
        System.out.println("Opgave 2.24: Watch order of operations");
        int a = 5;
        int b = 3;
        System.out.println("Sum: " + a + b);
        System.out.println("Sum: " + (a + b));

        //Opgave 2.25: TextBuilder object
        System.out.println("Opgave 2.25: TextBuilder object");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());
    }
}
