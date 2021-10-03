package opp.math;

public class Multiplier extends  CalcualtorBase{
    public Multiplier(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue() * getRightValue();
        setResult(value);
    }
}
