public class MainTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Start MainTest class");
        System.out.println("Start positive test: ");
        System.out.println("Start positive test add class");
        TestCalculate.testAddition_positiveFlow();

        System.out.println("Start positive test subtract class");
        TestCalculate.testIsSubtract_positiveFlow();

        System.out.println("Start positive test divide class");
        TestCalculate.testDivide_positiveFlow();

        System.out.println("Start positive test multiply class");
        TestCalculate.testMultiply_positiveFlow();

        System.out.println("Start un positive test: ");
        System.out.println("Start un positive test add class");
        TestCalculate.testAddition_unPositiveFlow();

        System.out.println("Start un positive test subtract class");
        TestCalculate.testIsSubtract_unPositiveFlow();

        System.out.println("Start un positive test divide class");
        TestCalculate.testDivide_unPositiveFlow();

        System.out.println("Start un positive test multiply class");
        TestCalculate.testMultiply_unPositiveFlow();
    }
}