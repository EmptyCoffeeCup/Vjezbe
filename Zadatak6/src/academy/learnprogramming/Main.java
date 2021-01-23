package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Zadatak 6: Učitati četiri broja i izračunati formulu

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite prvi broj a: ");
        double a = scan.nextDouble();

        System.out.print("Unesite drugi broj b: ");
        double b = scan.nextDouble();

        System.out.print("Unesite treći broj x: ");
        double x = scan.nextDouble();

        System.out.print("Unesite četvrti broj y: ");
        double y = scan.nextDouble();

        System.out.print("Rezultat jednadžbe ((x-y)/(a*b))+((x*y)/(a-b)) je " + (((x-y)/(a*b))+((x*y)/(a-b))));

    }
}
