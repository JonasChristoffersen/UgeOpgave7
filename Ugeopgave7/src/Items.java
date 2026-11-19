import java.util.Objects;

public class Items {
    private String ID;
    private String name;
    private double price;
    private double quantity;
    private String unit;
    private double moneySaved;
    private int cartAmount = 0;

    public Items(String ID, String name, double price, double quantity, String unit) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public void increaseCartAmount() {
        cartAmount++;
    }

    public int getCartAmount() {
        return cartAmount;
    }

    public String getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Items && this.ID == ((Items) o).getID()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ID);
    }

    public void setMoneySaved(double originalPrice) {
        this.moneySaved = originalPrice - price;
    }

    public double getMoneySaved() {
        return moneySaved;
    }
}