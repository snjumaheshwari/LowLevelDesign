package design_patterns.structural_pattern.composite_design_pattern.Calculator;

public class Number implements ArithmeticExpression {
    int num;
    public Number(int num){
        this.num = num;
    }
    @Override
    public int evaluate() {
        return num;
    }
}
