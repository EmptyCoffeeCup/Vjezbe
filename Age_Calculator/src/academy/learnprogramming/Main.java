package academy.learnprogramming;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
	// AgeCalculator - calculate the age from date of birth

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1996, 8, 18);
        int years = Period.between(birthDate, today).getYears();

        System.out.println(years);
    }
}
