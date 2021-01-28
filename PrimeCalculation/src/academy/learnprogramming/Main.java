package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
                if (count == 10) {
                    System.out.println("Exiting forloop");
                    break;
                }
            }
        }

    }
    public static boolean isPrime (int n) {

        if (n == 1) {       // provjerava se je li broj jedan, jer uvjet je da broj
            return false;   // mora biti veći od jedan
        }
        for (int i = 2; i <= n/2; i++) {
            if (n% i == 0) {
                return false;
            }
        } return true;
    }

}
