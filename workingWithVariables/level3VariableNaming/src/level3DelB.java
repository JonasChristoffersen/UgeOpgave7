public class level3DelB {
    public void main() {
        //Del B: Identifying Bad Names
        //Opgave 3.6: Find de dårlige navne
        System.out.println("Opgave 3.6: Find de dårlige navne");
        /* Opgave: Identificer hvad der er galt med disse navne:
        Variabelnavn - Hvad er galt?
        int a = 25; (Kort og ukonkret)
        double prc = 99.99; (Forkortelse er uforståelig)
        boolean b = true; (Kort og ukonkret)
        String usrnm = "test"; (Forkortelse er uforståelig)
        int num_students = 30; (Der skal bruges camelCase og ikke underscore!) */

        //Opgave 3.7: Ret de dårlige navne
        System.out.println("Opgave 3.7: Ret de dårlige navne");
        /* Opgave: Omdøb disse variable til GODE navne:
        int x = 30; (alder) -> int age = 30;
        double p = 199.99; (pris) -> double price = 199.99;
        boolean f = false; (om user er aktiv) -> boolean isUserActive = false;
        String n = "Anna"; (Brugers navn) -> String userName = "Anna"; */

        //Opgave 3.8: camelCase praksis
        System.out.println("Opgave 3.8: camelCase praksis");
        /* Opgave: Omdøb disse variable til GODE navne:
        int max_age = 150; -> int maxAge = 150;
        double product_price = 50.0; -> double productPrice = 50.0;
        boolean is_logged_in = true; -> boolean isLoggedIn = true;
        String user_name = "bob"; -> String username = "bob"; */

        //Opgave 3.9: For lange navne
        System.out.println("Opgave 3.9: For lange navne");
        /* Opgave: Forkort disse navne (hold dem beskrivende):
        int theCurrentNumberOfStudentsInTheClass = 25; -> int studentCount = 25;
        double theTotalPriceIncludingTaxAndShipping = 299.99; -> double totalPrice = 299.99;
        boolean isTheUserCurrentlyLoggedIntoTheSystem = true; -> boolean isLoggedIn = true; */

        //Opgave 3.10: For korte navne
        System.out.println("Opgave 3.10: For korte navne");
        /* Opgave: Gør disse navne mere beskrivende:
        int c = 10; (Counter af items) -> int itemCount = 10;
        double p = 50; (Pris per item) -> double pricePerItem = 50;
        boolean f = true; (Er valid) -> boolean isValid = true; */
    }
}
