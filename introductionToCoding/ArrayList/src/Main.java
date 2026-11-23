import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Driver> drivers = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> menuItems = new ArrayList<>();
        // 1 - Register driver
        // 2 - Show all drivers
        // 3 - quit

        menuItems.add("1 - Register driver");
        menuItems.add("2 - Show all drivers");
        menuItems.add("3 - quit");

        int menuSize = menuItems.size();

        for (String menuItem : menuItems) {
            System.out.println(menuItem);
        }

        int input = 0;

        while (input < 3) {
            System.out.println("Choose menu item");
            input = scan.nextInt();
            if (input == 1) {
                registerDriver();
            } else if (input == 2) {
                showAllDrivers();
            } else if (input == 3) {
//                quit();
            }
        }
    }

    public static void registerDriver() {
        //Ask for name + Description of car
        //Use parameters to instance a driver
        //Write a driver class
        //Set driver into arraylist of drivers
        System.out.println("What is the name of the driver?");
        scan.nextLine(); //Flush
        String name = scan.nextLine();
        System.out.println("What is the description of vehicle?");
        String description = scan.nextLine();

        Driver newDriver = new Driver(name, description);

        drivers.add(newDriver);
    }

    public static void showAllDrivers() {
        for (Driver d : drivers) {
            System.out.println(d);
        }
    }
}
