
import Calc.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculate {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition_positiveFlow() {

        // GIVEN
        int a = 10;

        // WHEN
        int h = calculator.addition(5, 5);

        // THEN
        assertEquals(a, h);

    }

}
