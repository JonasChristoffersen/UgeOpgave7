package variable;

public class PlayingWithVariables {
    public void main() {
        String name = "Jonas Christoffersen";
        String address = "Laurbærvænget 16, 3th";
        int zipcode = 3400;
        String city = "Hillerød";
        String studie = "Datamatiker";
        System.out.println(name);
        System.out.println(address);
        System.out.println(zipcode + " " + city);
        System.out.println("Kære " + name);
        System.out.println("Tillykke - Du er hermed optaget på " + studie);
    }
}