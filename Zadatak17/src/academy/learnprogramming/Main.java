package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ispisati brojeve od 1 do n

        int a = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int n = scan.nextInt();

        while (a <= n) {
            System.out.println(a);
            a++;
        }
    }
}
