package opp.math;

public class Multiplier extends  CalculateBase implements MathProcessing{
    public Multiplier(){

    }

    public Multiplier(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public double doCalcuoations(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();
        return getResult();
    }

    @Override
    public OperationCode getOperationCode() {
        return OperationCode.MULTIPLY;
    }

    @Override
    public void calculate() {
        double value = getLeftValue() * getRightValue();
        setResult(value);
    }
}
