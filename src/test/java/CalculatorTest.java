import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Calculator. Provides unit tests for each arithmetic operation.
 */
public class CalculatorTest {

    // Instance of the calculator to be tested.
    private final Calculator calculator = new Calculator();

    /**
     * Tests the add method.
     */
    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
    }

    /**
     * Tests the subtract method.
     */
    @Test
    public void testSubtract() {
        assertEquals(-1.0, calculator.subtract(2.0, 3.0));
    }

    /**
     * Tests the multiply method.
     */
    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
    }

    /**
     * Tests the divide method with valid inputs.
     */
    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
    }

    /**
     * Tests the divide method when the divisor is zero.
     */
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1.0, 0.0));
    }
}
