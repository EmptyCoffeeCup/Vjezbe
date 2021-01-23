package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int prviBroj = scan.nextInt();

        System.out.println("Unesi drugi broj: ");
        int drugiBroj = scan.nextInt();

        System.out.println(prviBroj + drugiBroj);
    }
}
