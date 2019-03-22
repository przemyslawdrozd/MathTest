package workshop.tests.exercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import service.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

    @Mock
    MathService mathService;

    @InjectMocks
    MathApp mathApp;

    @Test
    public void multiply() {
        when(mathService.multiply(10, 20)).thenReturn(3d);
        assertEquals(3d, mathApp.multiply(10, 20), 0d);
    }

    @Test
    public void multiply2() {
        when(mathService.multiply(10,10)).thenReturn(3d);
        assertEquals(2d, mathApp.multiply(10,10), 1d);
    }

    @Test
    public void add() {
        when(mathService.add(5, 5)).thenReturn(9d);
        assertEquals(10d, mathApp.add(5, 5), 1d);
    }

    @Test
    public void minus() {
        when(mathService.minus(5, 4)).thenReturn(5d);
        assertEquals(5d, mathApp.minus(5, 4), 0d);
    }
    @Test
    public void aggregate() {
        when(mathService.multiply(5, 4)).thenReturn(20d);
        assertEquals(0, mathApp.aggregate(5, 4), 0d);
    }

    @Test
    public void addTimesTwo() {
        when(mathService.add(5,5)).thenReturn(10d);
        assertEquals(20d, mathApp.addTimesTwo(5,5), 0d);
    }
}
