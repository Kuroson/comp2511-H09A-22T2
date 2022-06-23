package calculator;

public class Calculator {

    public static Double add(Double a, Double b) {
        return a + b;
    }

    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    /**
     * @precondition b != 0, a & b > 0
     * @postcondition returned output is always positive
     */
    public static Double divide(Double a, Double b) {
        return a / b;
    }

    public static Double sin(Double angle) {
        return Math.sin(angle);
    }

    public static Double cos(Double angle) {
        return Math.cos(angle);
    }

    /**
     * @precondition angle != 90
     * @param angle
     * @return
     */
    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

}