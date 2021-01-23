package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Zadatak 22: učitati 10 brojeva, koliko je učitanih parnih i njihov zbroj

        int brojac = 0;
        int suma = 0;

        for (int i = 1; i <=10; i++) {
            if (i % 2 == 0) {
                brojac++;
                suma += i;

            }
        }
        System.out.println("Učitano je " + brojac + " parnih brojeva.");
        System.out.println("Suma parnih brojeva iznosi " + suma);
    }
}
