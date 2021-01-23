package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Zadatak 4: opseg i površina pravokutnika

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesi vrijednost stranice A: ");
        double stranicaA = scan.nextDouble();

        System.out.println("Unesi vrijednost stranice B: ");
        double stranicaB = scan.nextDouble();

        System.out.println("-----------");

        System.out.println("Formula za površinu pravokutnika: P=a*b. Prema tome, površina P je " + (stranicaA*stranicaB));
        System.out.println("Formula za opseg pravokutnika: O=2*(a+b). Prema tome, opseg O je " + (2*(stranicaA+stranicaB)));
    }
}
