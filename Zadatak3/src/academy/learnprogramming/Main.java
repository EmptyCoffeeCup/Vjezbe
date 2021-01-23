package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zbroj = 0;
        int broj = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        broj = scan.nextInt();

        for(int i = 1; i <= broj; i++) {
            if(i % 2 == 0) {
                zbroj = zbroj + i;

            }
        }
        System.out.println("Zbroj parnih brojeva je " + zbroj);
    }
}
