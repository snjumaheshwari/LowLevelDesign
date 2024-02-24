package design_patterns.structural_pattern.composite_design_pattern.Calculator;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression left;
    ArithmeticExpression right;
    Operation operation;

    public Expression(ArithmeticExpression left, ArithmeticExpression right, Operation operation){
        this.left  = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        if(operation == Operation.ADD){
            return left.evaluate() + right.evaluate();
        }
        else if(operation == Operation.SUBTRACT){
            return left.evaluate() - right.evaluate();
        }
        else if(operation == Operation.MULTIPLY){
            return left.evaluate() * right.evaluate();
        }
        else if(operation == Operation.DIVIDE){
            return left.evaluate() / right.evaluate();
        }
        return -1;
    }
}
