public class Driver {
    private String name;
    private String carDescription;
    private int ID;
    static private int idCount = 1;

    //Write a constructor:
    public Driver(String name, String carDescription){
        this.name = name;
        this.carDescription = carDescription;
        this.ID = idCount;
        idCount++;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | Description: " + this.carDescription + " | ID: " + ID;
    }
}