package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Zadatak 20: suma n brojeva

        int suma = 0;
        int var = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int broj = scan.nextInt();

        while (var <= broj) {
            var++;
            suma += var;
        }
        System.out.println("Suma brojeva je " + suma);
    }
}
