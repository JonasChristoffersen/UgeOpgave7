public class Main {
    public static void main(String[] args) {
        Shipment s = new Shipment("Copenhagen", "Hong Kong", 4);
        //Objektet, adresse, håndtag, reference, instans

        s.setWeight(300); //1 pallet
        System.out.println(s.getDestination() + ": weight: " + s.getWeight());

        System.out.println(s);
    }
}