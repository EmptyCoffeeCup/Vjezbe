package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        area(4);
        area(7,11);

        System.out.println(area(4));
        System.out.println(area(7,11));

        }
    public static double area (double radius) {

        if (radius < 0) {
            return -1;
        } else {
            return (radius * radius * Math.PI);
        }
    }
    public static double area (double x, double y) {

        if ((x <= 0) || (y <= 0)) {
            return -1;
        } else {
            return x * y;
    }
    }
}
