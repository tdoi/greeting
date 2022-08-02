import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TriangleTest {

    @Test
    public void testInvalid_10_5_4() {
        Triangle triangle = new Triangle(10, 5, 4);

        Triangle.Type type = triangle.check();

        assertThat(type, is(Triangle.Type.INVALID));
    }

}
