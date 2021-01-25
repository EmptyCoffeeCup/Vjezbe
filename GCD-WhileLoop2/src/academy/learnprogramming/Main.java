package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int broj1, broj2, varijabla, GCD = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        broj1 = scan.nextInt();

        System.out.println("Unesi drugi broj: ");
        broj2 = scan.nextInt();

        while (broj2 != 0) {
            varijabla = broj2;
            broj2 = broj1 % broj2;
            broj1 = varijabla;
        }
        GCD = broj1;
        System.out.println("GCD = " + GCD);
    }
}
