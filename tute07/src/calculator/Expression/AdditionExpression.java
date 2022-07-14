package calculator.Expression;

/**
 * Composite
 */
public class AdditionExpression implements Expression {
    private Expression e1;
    private Expression e2;

    // (1) + (2)
    public AdditionExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    /**
     * Add the two expressions together
     */
    public double compute() {
        return this.e1.compute() + this.e2.compute();
    }
}
