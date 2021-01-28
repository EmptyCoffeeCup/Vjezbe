package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isOdd (int number) {
        return (number > 0) && (number % 2 != 0);
    }
    public static int sumOdd (int start, int end) {
        int sum = 0;
        if ((end >= start) && (end > 0) && (start > 0)) {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
