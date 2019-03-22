package workshop.tests.exercises;

import org.junit.Test;
import service.MathService;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void multiply() {
        // given
        MathService math = new MathService();
        int a = 2;
        int b = 3;
        int expectedOut = 6;

        // when
        double actualOut = math.multiply(a, b);

        // then
        assertEquals(expectedOut, actualOut, 0f);
    }

    @Test
    public void add() {
        // given
        MathService math = new MathService();
        int a = 5;
        int b = 10;
        int expectedOut = 15;

        // when
        double actual = math.add(a, b);

        // then
        assertEquals(expectedOut, actual, 1f);
    }
}