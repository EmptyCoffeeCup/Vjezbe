package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int prviBroj, drugiBroj, varijabla, GCD = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        prviBroj = scan.nextInt();

        System.out.println("Unesi drugi broj");
        drugiBroj = scan.nextInt();

        while (drugiBroj != 0) {
            varijabla = drugiBroj;
            drugiBroj = prviBroj % drugiBroj;
            prviBroj = varijabla;
        }
        GCD = prviBroj;
        System.out.println("GCD = " + GCD);
        }
    }

