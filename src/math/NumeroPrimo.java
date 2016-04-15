package math;

import java.lang.*;
import java.util.Scanner;


/**
 *
 */
public class NumeroPrimo {

    private static final String AFFIRMATIVE_RESPONSE = "Y";
    private static final String NEGATIVE_RESPONSE = "N";

    /**
     * This method is responsible for calculating whether a given number, provided by the user, is prime or not.
     *
     * @param args It receives no arguments at all.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* The user's answer to keep on working. By default, he WANTS to */
        String userResponse = AFFIRMATIVE_RESPONSE;

        /* The program will ask for testing prime numbers until the user explicitly answers no. */
        math.Math math = new math.Math();
        while (userResponse.equalsIgnoreCase(AFFIRMATIVE_RESPONSE)) {

            System.out.println("Which number do you want to test if it's prime?");
            int possiblePrime = scan.nextInt();

            /* The number is tested to be prime */
            if (math.isPrime(possiblePrime))
                System.out.println("It's prime! Yes it is!");
            else
                System.out.println("It is obviously not prime!");

            System.out.println("Do you want to test another number?");
            userResponse = scan.nextLine();
        }

    }
}
