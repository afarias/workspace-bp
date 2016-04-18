package jean;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

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
}