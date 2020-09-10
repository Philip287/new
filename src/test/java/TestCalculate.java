import Calc.Calculator;
import com.sun.xml.internal.ws.util.StringUtils;
import org.junit.Test;

import static Calc.Calculator.Addition;
import static Calc.Calculator.Subtract;
import static org.junit.Assert.*;

public class TestCalculate {

    @Test
    public static void testAddition_positiveFlow() {
        // GIVEN
        double source = Addition(5, 5);

        // WHEN
        double expected = 10;

        // THEN
        assertEquals("Unexpected string value", expected, source, 0);

    }

    @Test
    public static void testAddition_unPositiveFlow() {
        // GIVEN
        double source = Addition(5, 5);

        // WHEN
        double expected = 122;

        // THEN
        assertEquals("Unexpected string value", expected, source, 0);

    }

//    @Test
//    public void testScanner() {
//        // GIVEN
//        double source = Calculator.Scanner(str1.getBytes(10));
//
//        // WHEN
//        Double expected = 10.0;
//
//        // THEN
//        String actual = StringUtils.fromDouble(source);
//        assertEquals("Unexpected string value", expected, source, 0);
//    }

    @Test
    public static void testIsSubtract_positiveFlow() {
        // GIVEN
        double a = 1.0;

        // WHEN
        double h = Subtract(6, 5);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);

    }

    @Test
    public static void testIsSubtract_unPositiveFlow() {
        // GIVEN
        double a = 0.0;

        // WHEN
        double h = Subtract(6, 5);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);

    }


    @Test
    public void testDivide_positiveFlow() {

    }

    @Test
    public void testDivide_unPositiveFlow() {

    }

    @Test
    public void testMultiply_positiveFlow() {

    }

    @Test
    public void testMultiply_unPositiveFlow() {

    }

}