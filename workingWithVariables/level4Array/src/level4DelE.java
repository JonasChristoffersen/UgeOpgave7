public class level4DelE {
    public void main() {
        //Del E: Zero-Based Indexing
        //Opgave 4.21: Understanding indices
        System.out.println("Opgave 4.21: Understanding indices");
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        /* 1. element -> index: 0 -> Red
        2. element -> index: 1 -> Green
        3. element -> index: 2 -> Blue
        4. element -> index: 3 -> Yellow */

        //Opgave 4.22: Find the index
        System.out.println("Opgave 4.22: Find the index");
        /* Værdi = 100 -> index = 0
        Værdi = 300 -> index = 2
        Værdi = 500 -> index = 4
        Værdi = 600 -> index = 5 */

        //Opgave 4.23: Common mistakes
        System.out.println("Opgave 4.23: Common mistakes");
        String[] days = {"Mon", "Tue", "Wed"};
        String firstDay = days[1];
        /* Hvad får firstDay? = First day får "Tue"
        Hvad er fejlen? = Index starter på 0 og ikke 1
        Korrekt kode = String firstDay = days[0]; */

        //Opgave 4.24: Last index
        System.out.println("Opgave 4.24: Last index");
        /* Opgave: Givet et array med 8 elementer.
        Hvad er første index? = 0
        Hvad er sidste index? = 7
        Hvad er array.lenght? = 8 */

        //Opgave 4.25: Index range
        System.out.println("Opgave 4.25: Index range");
        double[] prices = {9.99, 19.99, 29.99, 39.99, 49.99};
        /* Antal elementer (length) = 5
        Valid index range = 0-4
        Første valid index = 0
        Sidste valid index = 4 */
    }
}
