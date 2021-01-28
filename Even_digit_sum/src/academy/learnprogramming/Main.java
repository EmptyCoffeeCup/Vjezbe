package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        try {
//            int [] a = {4, 5, 1};
//            System.out.println(a [0]);
//        } catch (Exception e) {
//            System.out.println("You got an exception.");
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Unesi broj: ");
//
//        try {
//            int n = scan.nextInt();
//            System.out.println(n);
//        } catch (Exception e) {
//            System.out.println("Pogrešan unos. Molim, ponovo unesite broj.");
//        }

        try{
            int [] a = {4};
            System.out.println(a[1]);

        } catch (NullPointerException e) {
            System.out.println("your array is null.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds.");

        } catch (Exception e) {
            System.out.println("Something else went wrong.");
        }
    }
}
