package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Zadatak 8: Unijeti cijeli broj, odrediti je li pozitivan, negativan ili nula.

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = scan.nextInt();

        if (broj < 0) {
            System.out.println("Broj " + broj + " je negativan.");
        }
        else if (broj > 0) {
            System.out.println("Broj " + broj + " je pozitivan.");
        }
        else {
            System.out.println("Iznos je jednak nuli.");
        }
    }
}
