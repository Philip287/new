import Calc.Calculator;
import org.junit.*;

import static Calc.Calculator.*;
import static org.junit.Assert.*;

public class TestCalculate {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition_positiveFlow() {
        // GIVEN
        double source = Addition(5, 5);

        // WHEN
        double expected = 10;

        // THEN
        assertEquals("Unexpected string value", expected, source, 0);

    }

    @Test
    public void testAddition_unPositiveFlow()throws Exception {
        // GIVEN
        double source = Addition(5, 5);

        // WHEN
        double expected = 122;

        // THEN
        assertEquals("Unexpected string value", expected, source, 0);

    }

//    @Test
//    public void testScanner()throws Exception {
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
    public void testIsSubtract_positiveFlow() {
        // GIVEN
        double a = 1.0;

        // WHEN
        double h = Subtract(6, 5);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);

    }

    @Test
    public void testIsSubtract_unPositiveFlow()throws Exception {
        // GIVEN
        double a = 0.0;

        // WHEN
        double h = Subtract(6, 5);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);

    }


    @Test
    public void testDivide_positiveFlow() {
        // GIVEN
        double a = 5.0;

        // WHEN
        double h = Divide(5, 1);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);
    }

    @Test
    public void testDivide_unPositiveFlow() throws Exception {
        // GIVEN
        double a = 0.0;

        // WHEN
        double h = Divide(5, 5);

        // THEN
        assertEquals("Unexpected string value", a, h, 0);

    }

    @Test
    public void testMultiply_positiveFlow()  {
        assertEquals("Unexpected string value", Multiply(5, 5), 25, 0);
    }

    @Test
    public void testMultiply_unPositiveFlow() throws Exception {
        assertEquals("Unexpected string value", Multiply(5, 5), 26, 0);
    }

}