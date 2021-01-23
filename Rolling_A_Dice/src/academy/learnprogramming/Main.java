package academy.learnprogramming;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random kocka = new Random();
        int broj = kocka.nextInt(6) + 1;

        System.out.println("Na kocki si dobio broj " + broj);
    }
}
