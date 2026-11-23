public class level2DelC {
    public void main() {
        //Del C: Modulo Operator (%)
        //Opgave 2.11: Find leftovers
        System.out.println("Opgave 2.11: Find leftovers");
        int candy = 23;
        int children = 5;
        int candyPerChildren = candy / children;
        int leftOverCandy = candy % children;
        System.out.println(candyPerChildren);
        System.out.println(leftOverCandy);

        //Opgave 2.12: Even or odd
        System.out.println("Opgave 2.12: Even or odd");
        int number = 17;
        int remainder = number % 2;
        if (remainder == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //Opgave 2.13: Modulo with object
        System.out.println("Opgave 2.13: Modulo with object");
        int pizzaSlices = 15;
        int people = 4;
        int slicesPerPerson = pizzaSlices / people;
        int slicesLeftOver = pizzaSlices % people;
        System.out.println(slicesPerPerson);
        System.out.println(slicesLeftOver);

        //Opgave 2.14: Which turn is it?
        System.out.println("Opgave 2.14: Which turn is it?");
        int totalTurns = 17;
        int playerCount = 4;
        int currentPlayer = totalTurns % playerCount;
        System.out.println("Player "+currentPlayer+"'s turn");

        //Opgave 2.15: Day of week cycling
        System.out.println("Opgave 2.15: Day of week cycling");
        int dayNumber = 25;
        int weekDay = dayNumber % 7;
        System.out.println(weekDay);
    }
}
