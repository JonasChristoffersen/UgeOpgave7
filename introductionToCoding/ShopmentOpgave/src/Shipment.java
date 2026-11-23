public class Shipment {
    private int hoursToDelivery;
    private String destination;
    private String departure;
    //Customer
    private int palletCount;

    private double tax;
    private double weight;

    public Shipment(String departure, String destination, int palletCount) {
        this.departure = departure;
        this.destination = destination;
        this.palletCount = palletCount;
    }

    public String toString() {
        String s;
        s = "From: " + this.departure + "\nTo: " + this.destination + "\nWeight: " + this.weight + "kg";
        return s;
    }

    //Methods
    void calcTax() {

    }
    void calcWeight() {

    }

    public void setWeight(double weight) {
        this.weight = weight * palletCount;
    }

    public String getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }
}
