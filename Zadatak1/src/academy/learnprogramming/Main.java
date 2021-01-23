package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Unesi prvi broj: ");
        int prviBroj = scan.nextInt();
        System.out.print("Unesi drugi broj: ");
        int drugiBroj = scan.nextInt();

        System.out.println("Zbroj dva unesena broja je " + (prviBroj + drugiBroj));
        System.out.println("Aritmetička sredina dva broja je " + (prviBroj + drugiBroj)/2);
        System.out.println("Zbroj kvadrata dva broja iznosi " + (((int) Math.pow(prviBroj, 2)) + ((int) Math.pow(drugiBroj, 2))));
    }

}
