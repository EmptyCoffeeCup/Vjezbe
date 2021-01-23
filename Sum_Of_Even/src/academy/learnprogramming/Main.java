package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Sum of even numbers

        int suma = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite jedan broj: ");
        int broj = scan.nextInt();

        for (int i = 1; i <= broj; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println("Zbroj unesenih brojeva je " + suma);
    }
}
