public class Level5DelD {
    public void main() {
        //Del D: Nested For Loops
        //Opgave 5.14: Multiplication table
        System.out.println("Opgave 5.14: Multiplication table");
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }

        //Opgave 5.15: Simple nested loop
        System.out.println("Opgave 5.15: Simple nested loop");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        //Opgave 5.16: Number rectangle
        System.out.println("Opgave 5.16: Number rectangle");
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        //Opgave 5.17: Star rectangle
        System.out.println("Opgave 5.17: Star rectangle");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 7; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Opgave 5.18: Right triangle
        System.out.println("Opgave 5.18: Right triangle");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Opgave 5.19: Number triangle
        System.out.println("Opgave 5.19: Number triangle");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        //Opgave 5.20: Inverted triangle
        System.out.println("Opgave 5.20: Inverted triangle");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
