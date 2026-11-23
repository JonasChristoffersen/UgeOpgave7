public class ShoppingCart {
    Item[] items = new Item[10];
    int itemIndex = 0;

    public void addItem(Item item) {
        items[itemIndex] = item;
        itemIndex++;
    }
}
