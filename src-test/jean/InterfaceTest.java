package jean;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InterfaceTest {

    private Interface anInterface = new Interface();

    @Test
    public void testAskQuestion() throws Exception {

        String[] answers = {"Yes", "No"};
        String theAnswer = anInterface.askQuestion("Are you a man?", answers);

        assertThat(theAnswer, anyOf(is("Yes"), is("No")));
    }

    @Test
    public void testAskQuestion1() throws Exception {

        String[] answers = {"Yes", "No"};
        String theAnswer = anInterface.askQuestion("Are you a man?", answers);

        assertThat(theAnswer, anyOf(is("Yes"), is("No"), is("YES"), is("NO"), is("yes"), is("no")));
    }
}