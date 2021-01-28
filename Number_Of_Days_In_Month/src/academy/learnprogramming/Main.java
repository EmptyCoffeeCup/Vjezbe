package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    }
    public static boolean isLeapYear (int year) {
        return (year > 1 && year < 9999) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDaysInMonth (int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        if (month == 2) {
            return (!isLeapYear(year)) ? 28 : 29;
        }
        return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }
}
