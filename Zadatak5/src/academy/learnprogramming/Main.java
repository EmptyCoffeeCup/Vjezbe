package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Zadatak 5: Izračunati opseg i površinu istostraničnog trokuta. Stranica A = 4.

        Scanner scan = new Scanner(System.in);
        System.out.print("Unesi stranicu trokuta: ");
        double stranicaA = scan.nextDouble();
        double povrsina = (Math.sqrt(3)/4)*(stranicaA*stranicaA);
        double opseg = 3*stranicaA;

        System.out.println("Površina iznosi " + povrsina);
        System.out.println("Opseg iznosi " + opseg);
    }
}
