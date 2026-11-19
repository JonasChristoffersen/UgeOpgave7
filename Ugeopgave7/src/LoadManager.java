import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LoadManager {
    private final FileIO fileIO = new FileIO();
    private final String itemPath = "data/varer.csv";
    private final String discountPath = "data/tilbud.csv";

    public HashMap<String, Items> loadDiscountedItems() {
        ArrayList<String> data = fileIO.readData(discountPath);
        HashMap<String, Items> hashMap = new HashMap<>();
        for (String s : data) {
            String[] values = s.split(";");
            String ID = values[0];
            String name = values[1];
            double price = Double.parseDouble(values[3]);
            double quantity = Double.parseDouble(values[5]);
            String unit = values[6];
            Items item = new Items(ID, name, price, quantity, unit);
            hashMap.put(ID, item);
        }
        loadItems(hashMap);
        return hashMap;
    }

    public void loadItems(HashMap<String, Items> hashMap) {
        ArrayList<String> data = fileIO.readData(itemPath);
        for (String s : data) {
            String[] values = s.split(";");
            String ID = values[0];
            String name = values[1];
            double price = Double.parseDouble(values[3]);
            double quantity = Double.parseDouble(values[5]);
            String unit = values[6];
            Items item = new Items(ID, name, price, quantity, unit);

            if (hashMap.containsKey(ID)) {
                hashMap.get(ID).setMoneySaved(price);
            } else {
                hashMap.put(ID, item);
            }
        }
    }
}