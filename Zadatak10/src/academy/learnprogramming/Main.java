package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Zadatak 10: Unijeti tri broja, ispisati najmanji, srednji i najveći.

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesi prvi broj: ");
        int a = scan.nextInt();

        System.out.print("Unesi drugi broj: ");
        int b = scan.nextInt();

        System.out.print("Unesi treći broj: ");
        int c = scan.nextInt();

        int najveci = a;

        if (b > najveci)
            najveci = b;
        if (c > najveci)
            najveci = c;

        int najmanji = a;

        if (b < najmanji)
            najmanji = b;
        if (c < najmanji)
            najmanji = c;

        int srednji = a;

        if (((b < a) && (b > c)) || ((b > a) && (b < c)))
            srednji = b;
        if (((c < b) && (c > a)) || ((c > b) && (c < a)))
            srednji = c;

        System.out.println("Najmanji broj je " + najmanji);
        System.out.println("Srednji broj je " + srednji);
        System.out.println("Najveći broj je " + najveci);
    }
}


