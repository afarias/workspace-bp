package math;

public class Math {
    public Math() {
    }

    /**
     * This method is responsible for determining whether a number is prime or not.
     *
     * @param possiblePrimeNumber The number to be tested to be prime.
     *
     * @return Returns <code>true</code> if it is prime or <code>false</code> otherwise.
     */
    public boolean isPrime(int possiblePrimeNumber) {

        /* The base cases are cover here, for numbers 1 and zero */
        if (possiblePrimeNumber == 0 || possiblePrimeNumber == 1)
            return false;

        /*
         * The possible divider of the given number.
         * Because a number have no dividers greater than it's half
         * (and one) the greatest possible divider will be it's half.
         */
        int possibleDivider = possiblePrimeNumber / 2;

        while (possibleDivider > 1) {

            /* If the possibleDivider divides the possiblePrimeNumber then it is not prime */
            if ((possiblePrimeNumber % possibleDivider) == 0)
                return false;

            /* The next number is tested */
            possibleDivider--;
        }

        /* At this point, the possiblePrimeNumber has not dividers, so it is prime */
        return true;
    }

}
