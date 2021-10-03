package opp.math;

public class Substracter extends CalcualtorBase {
    public Substracter(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }
    @Override
    public void calculate() {
        double value = getLeftValue() - getRightValue();
        setResult(value);
    }
}
