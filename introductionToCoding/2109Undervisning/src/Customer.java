public class Customer {
    String name;
    ShoppingCart shoppingCart;

    public Customer(String name) {
        this.name = name;
        shoppingCart = new ShoppingCart();
    }
}
