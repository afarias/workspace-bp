package jean;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class InquisitorTest {



    private Inquisitor anInquisitor = new Inquisitor();

    @Test
    public void testAskQuestion() throws Exception {

        String[] answers = {"Yes", "No"};
        String theAnswer = anInquisitor.askQuestion("Are you a man?", answers);

        assertThat(theAnswer, anyOf(is("Yes"), is("No")));
    }

    @Test
    public void testAskQuestion1() throws Exception {

        String[] answers = {"Yes", "No"};
        String theAnswer = anInquisitor.askQuestion("Are you a man?", answers);

        assertThat(theAnswer, anyOf(is("Yes"), is("No"), is("YES"), is("NO"), is("yes"), is("no")));
    }

    @Test
    public void testAskQuestion2() throws Exception {

        int startRange = 0, endRange = 9;
        int theAnswer = anInquisitor.askQuestion("Choisissez entre 1 et 10", startRange, endRange);

        assertThat(theAnswer, anyOf(is(1), is(2), is(3), is(4), is(5), is(6), is(7),is(8), is(9)));
    }
}