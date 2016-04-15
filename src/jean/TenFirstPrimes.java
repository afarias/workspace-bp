package jean;

import math.Math;

/**
 * Created by andres on 3/28/16.
 */
public class TenFirstPrimes {

    /**
     * This method is responsible for printing the ten first prime numbers.
     * @param args It receives no arguments at all.
     */
    public static void main(String[] args) {
        Math math = new Math();

        int nPrimes = 0;
        int aNumber = 2;

        /* The program will run until it find ten prime numbers */
        while(nPrimes < 10){
            /* The number is tested to be prime, printed and counted */
            if (math.isPrime(aNumber)){
                System.out.println(aNumber);
                nPrimes++;
            }
            /* The program go to the next number to test */
            aNumber++;
        }

    }
}
