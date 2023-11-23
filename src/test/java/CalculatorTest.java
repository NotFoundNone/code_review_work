import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(5, 2);
        assertEquals(3, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(8, 4);
        assertEquals(2, result);
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(3, 4);
        assertEquals(12, result);
    }

    @Test
    void solverAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.solver(2, 3, '+');
        assertEquals(5, result);
    }

    @Test
    void solverSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.solver(5, 2, '-');
        assertEquals(3, result);
    }

    @Test
    void solverMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.solver(3, 4, '*');
        assertEquals(12, result);
    }

    @Test
    void solverDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.solver(8, 4, '/');
        assertEquals(2, result);
    }

    @Test
    void solverUnsupportedOperator() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.solver(1, 2, '%'));
    }

    @Test
    void solverDivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.solver(1, 0, '/'));
    }
}
