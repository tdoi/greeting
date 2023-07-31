import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GreetingTest extends BaseMockTest {

    private Greeting greeting = new Greeting();

    @Test
    public void test_goodMorning() {
        greeting.setClock(new Greeting.Clock() {
            @Override
            public int getHour() {
                return 8;
            }
        });

        String message = greeting.greet();

        assertThat(message, is("Good Morning"));
    }

    @Test
    public void test_goodEvening() {
        greeting.setClock(new Greeting.Clock() {
            @Override
            public int getHour() {
                return 20;
            }
        });

        String message = greeting.greet();

        assertThat(message, is("Good Evening"));
    }

}
