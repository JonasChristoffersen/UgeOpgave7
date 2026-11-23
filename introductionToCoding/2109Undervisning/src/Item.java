public class Item {
    double price;
    String type;
    String label;
    int discount;

    //Constructor
    public Item(String label, int price, int discount, String type) {
        this.label = label;
        this.price = price;
        this.discount = discount;
        this.type = type;
    }

    public double getDiscountedPrice() {
        return price * (1 - (double) discount / 100);
    }
}
