package jean;

import controlStructures.Math;

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
        while(nPrimes < 10){
            if (math.isPrime(aNumber)){
                System.out.println();
                nPrimes++;
            }

            aNumber++;
        }

    }
}
