package opp.math;

public class Adder extends CalcualtorBase{
    public Adder(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public void calculate() {
        double value = getLeftValue()+getRightValue();
        setResult(value);
    }
}
