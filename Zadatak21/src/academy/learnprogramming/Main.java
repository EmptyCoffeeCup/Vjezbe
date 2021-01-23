package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// Zadatak 21: Ispiši brojeve 20-100 djeljive s 11. Broj 77 ispisati riječima.

       for (int i = 22; i <= 100; i+=11) {

           if (i != 77) {
               System.out.println(i);
           }else {
               System.out.println("Sedamdeset i sedam");
           }
       }

    }
}
