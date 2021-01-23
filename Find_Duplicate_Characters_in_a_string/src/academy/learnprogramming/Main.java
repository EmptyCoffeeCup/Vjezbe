package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String recenica = "Koliko je dvostrukih slova u ovoj recenici?";
        System.out.println(recenica);

        String slova = "";
        String dvostrukaSlova = "";
        for (int i = 0; i < recenica.length(); i++) {
            String current = Character.toString(recenica.charAt(i));
            if (slova.contains(current)) {
                if (dvostrukaSlova.contains(current)) {
                    dvostrukaSlova += current + ",";
                }
            }

            slova += current;
        }
        System.out.println(dvostrukaSlova);
    }
}