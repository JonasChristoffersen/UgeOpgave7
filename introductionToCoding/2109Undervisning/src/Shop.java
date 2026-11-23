public class Shop {
    public void main() {
        //items
        Item item1 = new Item("Hammer", 149, 5, "Tool");
        Item item2 = new Item("Støvsuger", 2100, 20, "Domestic tool");
        Item item3 = new Item("Saw", 300, 12, "Tool");
        Item item4 = new Item("Pencil", 25, 0, "School supplies");
        Item item5 = new Item("Note block", 49, 10, "School supplies");

        //customer
        Customer customer = new Customer("Peter");

        //Add a items to item array in class "ShoppingCart"
        customer.shoppingCart.addItem(item4);

    }
}
