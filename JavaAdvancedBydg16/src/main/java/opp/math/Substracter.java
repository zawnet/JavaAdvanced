package opp.math;

public class Substracter extends CalculateBase implements MathProcessing {

    public Substracter(){

    }
    public Substracter(double leftValue, double rightValue) {
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
        return OperationCode.SUBSTRACT;
    }

    @Override
    public void calculate() {
        double value = getLeftValue() - getRightValue();
        setResult(value);
    }
}
