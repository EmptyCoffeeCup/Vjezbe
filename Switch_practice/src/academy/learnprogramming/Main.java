package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

//	    int value = 1;
//	    if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//	    int switchValue = 4;
//
//	    switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//
//        }
//        char charValue = 'h';
//
//        switch (charValue) {
//            case 'A':
//                System.out.println("Char is A");
//                break;
//            case 'B':
//                System.out.println("Char is B");
//                break;
//            case 'C': case 'D': case 'E':
//                System.out.println(charValue + " was found");
//                break;
//
//            default:
//                System.out.println("A, B, C, D, or E not found.");
//                break;
//        }
//        String month = "january";
//
//        switch (month) {
//            case "January":
//                System.out.println("Jan");
//                break;
//            case "February":
//                System.out.println("Feb");
//                break;
//            case "March":
//                System.out.println("Mar");
//                break;
//
//            default:
//                System.out.println("Not sure");
//        }

        }
    public static void printDayOfTheWeek (int day) {


        if (day == 0) {
            System.out.println("Sunday");
        }
        else if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
        else if (day == 4) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Invalid day");
        }

//        switch (day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            default:
//                System.out.println("Invalid day");
//                break;
//        }
    }
}
