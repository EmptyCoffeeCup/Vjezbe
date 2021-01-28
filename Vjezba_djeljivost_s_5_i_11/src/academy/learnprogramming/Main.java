package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Je li broj djeljiv s 5 i 11

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite broj za provjeru djeljivosti: ");
        int broj = scan.nextInt();

        if ((broj % 5 == 0) && (broj % 11 == 0)) {
            System.out.println("Broj je djeljiv s 5 i s 11.");
        } else {
            System.out.println("Broj nije djeljiv s 5 i s 11.");
        }
    }
}
