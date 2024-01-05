package Ex_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(10,calculator.add(7,3));
        assertEquals(15,calculator.add(15,0));
        assertEquals(60,calculator.add(100,-40));
        assertEquals(-30,calculator.add(10,-40));
        assertEquals(0,calculator.add(40,-40));
        assertEquals(0,calculator.add(0,0));
    }
    @Test
    public void subtractTest(){

        assertEquals(50,calculator.subtract(110,60));
        assertEquals(-170,calculator.subtract(-110,60));
        assertEquals(0,calculator.subtract(5,5));
        assertEquals(10,calculator.subtract(5,-5));
    }


    @Test
    public void multiplyTest(){

        assertEquals(20,calculator.multiply(10,2));
    }

    @Test
    public void divideTest(){

        assertEquals(10,calculator.divide(100,10));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(0, 0);
        });
    }
}
