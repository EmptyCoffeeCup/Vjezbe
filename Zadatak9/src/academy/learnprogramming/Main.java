package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Zadatak 9: Unijeti tri broja, ispisati najveći od njih.

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesi prvi broj: ");
        int prvi = scan.nextInt();

        System.out.print("Unesi drugi broj: ");
        int drugi = scan.nextInt();

        System.out.print("Unesi treći broj: ");
        int treci = scan.nextInt();

        if ((prvi > drugi) && (prvi > treci)) {
            System.out.println("Broj " + prvi + " je najveći.");
        }
        else if ((drugi > prvi) && (drugi > treci)) {
            System.out.println("Broj " + drugi + " je najveći.");
        }
        else {
            System.out.println("Broj " + treci + " je najveći.");
        }
    }
}
