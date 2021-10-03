package opp.math;

public class Divider extends CalcualtorBase{
    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }
}
