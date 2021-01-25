import java.util.Scanner;

public class VeciOdDvaBroja {

    int broj1, broj2;

    Scanner scan = new Scanner(System.in);

    {
        System.out.println("Unesi prvi broj: ");
        broj1 = scan.nextInt();

        System.out.println("Unesi drugi broj: ");
        broj2 = scan.nextInt();

        if (broj1 > broj2) {
            System.out.println("Veći broj je " + broj1);
        }
        else if (broj1 < broj2) {
            System.out.println("Veći broj je " + broj2);
        }
        else {
            System.out.println("Brojevi su jednaki.");
        }
    }
}
