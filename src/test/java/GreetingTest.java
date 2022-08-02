import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GreetingTest extends BaseMockTest {

    @Mock
    private Greeting.Clock clock;

    @InjectMocks
    private Greeting greeting;

    @Test
    public void test_goodMorning() {
        when(clock.getHour()).thenReturn(8);

        String message = greeting.greet();

        assertThat(message, is("Good Morning"));
    }

    @Test
    public void test_goodEvening() {
        when(clock.getHour()).thenReturn(20);

        String message = greeting.greet();

        assertThat(message, is("Good Evening"));
    }

}
