package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Unijeti broj, ako je < 0 ispisati sljedbenik, ako je > 0 ispisati prethodnik

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int broj = scan.nextInt();

        if (broj < 0) {
            System.out.println("Broj je manji od nule i njegov sljedbenik je " + (broj + 1));
        } else {
            System.out.println("Broj je veći od nule i njegov prethodnik je " + (broj - 1));
        }
    }
}
