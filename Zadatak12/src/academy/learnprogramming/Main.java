package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Zadatak 12: unijeti broj i provjeriti je li djeljiv s 3

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int broj = scan.nextInt();

        if (broj % 3 == 0) {
            System.out.println("Broj je djeljiv s tri.");
        } else {
            System.out.println("Broj nije djeljiv s tri.");
        }
    }
}
