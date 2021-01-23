package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// Suma prvih 5 brojeva

        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            suma += i;
        }
        System.out.println("suma brojeva je " + suma); // ako sout stavim odmah iza suma=+i,
                                                        // ispisat će sve zbrojeve, ne samo posljednji
    }
}
