package jean;

import bank.Programa;

/**
 * Created by Admin on 25/04/2016.
 */
public class TestsDivers {
    public static void main(String[] args) throws TooBigForIntegerException {

        Inquisitor anInquisitor = new Inquisitor();
        anInquisitor.askQuestion("Choisis entre 0 et 10", 0,10);
    }
}
