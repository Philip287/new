import Calc.Calculator;

public class MainTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Start MainTest class");
        System.out.println("Start positive test add class");
        TestCalculate.testAddition_positiveFlow();
        System.out.println("Start un positive test add class");
        TestCalculate.testAddition_unPositiveFlow();
        System.out.println("Start positive test subtract class");
        TestCalculate.testIsSubtract_positiveFlow();
        System.out.println("Start un positive test subtract class");
        TestCalculate.testIsSubtract_unPositiveFlow();
    }
}