import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(3,calc.add(1,2));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(3,calc.dif(5,2));
        assertEquals(0,calc.dif(5,5));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(5,calc.div(10,2));
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(10,calc.times(5,2));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.solver(4, 6,2));
    }
}