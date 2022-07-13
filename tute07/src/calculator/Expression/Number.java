package calculator.Expression;

/**
 * Leaf node
 */
public class Number implements Expression {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    /**
     * @preconditions - none
     * @postconditions - returns number
     */
    public double compute() {
        return number;
    }
}
