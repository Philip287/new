import Calc.Calculator;
import com.sun.xml.internal.ws.util.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculate {

    Calculator calculator = new Calculator();

//    @Test
//    public void testAddition_positiveFlow() {
//
//         GIVEN
//        double source;
//        source = calculator.Addition(5, 5);
//
//         WHEN
//        String expected = "10";
//
//         THEN
//        String actual = StringUtils. (source);
//        assertEquals("Unexpected string value", expected, actual);
//
//    }

//    @Test
//    public void testScanner() {
//         GIVEN
//        double source = Calculator.Scanner(str1.getBytes(10));
//
//         WHEN
//        Double expected = 10.0;
//
//         THEN
//        String actual = StringUtils.fromDouble(source);
//        assertEquals("Unexpected string value", expected, source);
//    }

    @Test
    public void testIsSubtract_positiveFlow() {
        // GIVEN
        double a = 1.0;

        // WHEN
        double h = calculator.Subtract(6, 5);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);

    }

    @Test
    public void testIsSubtract_unPositiveFlow() {
        // GIVEN
        double a = 0.0;

        // WHEN
        double h = calculator.Subtract(6, 5);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);

    }


    @Test
    public void testDivide() {

    }

    @Test
    public void testMultiply() {

    }

}