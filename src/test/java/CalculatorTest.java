import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.add(5,3));
        assertEquals(-1,calculator.add(-2,1));
        assertEquals(3,calculator.add(2,1));
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        assertEquals(9,calculator.dif(11,2));
        assertEquals(4,calculator.dif(8,4));
        assertEquals(3,calculator.dif(4,1));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.div(8,2));
        assertEquals(1,calculator.div(7,7));
        assertEquals(9,calculator.div(81,9));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(18,calculator.times(9,2));
        assertEquals(49,calculator.times(7,7));
        assertEquals(42,calculator.times(7,6));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(36,calculator.solver(5,4,10,2));
    }
}