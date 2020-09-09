import Calc.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculate {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition_positiveFlow() {

        // GIVEN
        double a = 10;

        // WHEN
        double h = calculator.Addition(5, 5);

        // THEN
        assertEquals(a, h);

    }

    @Test
    public void testScanner() {

    }

    @Test
    public void testIsSubtract() {

    }

    @Test
    public void testDivide() {

    }

    @Test
    public void testMultiply() {

    }

}