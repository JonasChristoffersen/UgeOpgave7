import java.util.Scanner;

public class WorkingWithArrays {
    public void main() {
        String[] arrayList = new String[10];


        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Indtast array værdi 1");
        arrayList[0] = keyboardInput.nextLine();
        System.out.println("Indtast array værdi 2");
        arrayList[1] = keyboardInput.nextLine();
        System.out.println("Indtast array værdi 3");
        arrayList[2] = keyboardInput.nextLine();
        System.out.println("Indtast array værdi 4");
        arrayList[3] = keyboardInput.nextLine();
        System.out.println("Indtast array værdi 5");
        arrayList[4] = keyboardInput.nextLine();

        System.out.println(
                "De indtastede array værdier er: "
                + arrayList[0] + ", "
                + arrayList[1] + ", "
                + arrayList[2] + ", "
                + arrayList[3] + ", "
                + arrayList[4]
        );
    }
}
