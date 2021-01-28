package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//	int count = 1;
//	while (count != 6) {
//        System.out.println("count value is = " + count);
//        count++;
//
//    }
//        System.out.println("-------");
//
//	count = 1;
//	while (true) {
//	    if (count == 6) {
//	        break;
//        }
//        System.out.println("count value is = " + count);
//        count++;
//    }
//	count = 1;
//	do {
//        System.out.println("count value was " + count);
//        count++;
//    } while (count != 6);

        int total = 0;
        int number = 4;
        int finishNumber = 22;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number = " + number);

            total++;
            if (total >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found: " + total);

    }
    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        }
        else {
        return false;
    }
}
}
