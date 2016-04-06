package referencialTypes;

/**
 * Created by andres on 4/5/16.
 */
public class TheString {

    public static void main(String[] args) {

        String a = "Hola";
        String b = "Hola";

        if (a == b)
            System.out.println("Iguales");
        else
            System.out.println("Distintos");
    }
}
