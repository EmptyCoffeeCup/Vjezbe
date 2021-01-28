package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number 688 is " + sumDigits(688));
        System.out.println("Sum of digits in number 222 is " + sumDigits(222));
    }
    private static int sumDigits (int number) {
        if (number <10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;
    }

}
