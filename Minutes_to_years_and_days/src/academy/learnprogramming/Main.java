package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }
    public static void printYearsAndDays (long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long day = minutes / 1440;
            long year = day / 365;
            long remainingDay = day % 365;

            System.out.println(minutes + "min = " + year + " y " + remainingDay + " d");
        }
    }
}