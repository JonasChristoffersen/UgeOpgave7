import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CashRegister {
    LoadManager loadManager = new LoadManager();
    Robot robot = new Robot();

    public boolean isItemDiscounted(Items item) {
        if (item.getMoneySaved() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void receipt() {
        Collection<Items> shoppingCart = robot.fyldIKurv(loadManager.loadDiscountedItems());
        double discountAmount = 0;
        double taxAmount = 0;
        double totalSum = 0;
        System.out.println("=== Receipt for robot ===");

        ArrayList<Items> newCart = new ArrayList<>();
        for (Items item : shoppingCart) {
            if (item.getCartAmount() <= 0) {
                newCart.add(item);
            }
            item.increaseCartAmount();
        }

        for (Items item : newCart) {
            if (isItemDiscounted(item)) {
                discountAmount += item.getMoneySaved();
            }
            totalSum += item.getPrice();
            taxAmount += (item.getPrice() * 0.25);

            System.out.println("Item: " + item.getName()
                    + "\n" + "Quantity: " + (item.getQuantity() * item.getCartAmount()) + " " + item.getUnit()
                    + "\n" + "Price: " + (item.getPrice() * item.getCartAmount()) + " DKK"
                    + "\n" + "Amount: " + item.getCartAmount()
                    + "\n" + "- - - - - - - - - - - - - - - - -"
            );
        }
        System.out.println("=== Final info ==="
                + "\n" + "Total amount: " + totalSum + " DKK"
                + "\n" + "Total saved amount: " + discountAmount + " DKK"
                + "\n" + "Tax amount: " + taxAmount + " DKK"
        );
    }
}