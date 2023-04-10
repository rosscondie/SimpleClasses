import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator(30, 20, 150.00, 300.00);

    }
    @Test
    public void canAddNumbers() {
        assertEquals(50, calculator.addNumbers());
    }

    @Test
    public void canSubtractNumbers() {
        assertEquals(10, calculator.subtractNumbers());
    }

    @Test
    public void canMultiply() {
        assertEquals(600, calculator.multiplyNumbers());
    }

    @Test
    public void canDivide() {
        assertEquals(0.5, calculator.divideNumbers(), 0.0);
    }

}
