package opp.math;

public class Divider extends CalculateBase implements MathProcessing {
    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    public Divider(){

    }

    @Override
    public double doCalcuoations(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();
        return  getResult();
    }

    @Override
    public OperationCode getOperationCode() {
        return OperationCode.DIVIDE;
    }

    @Override
    public void calculate() {
        // dla double dzielenie przez 0 działa i zwaraca infinity
        //wymuszamy wystąpienie wujątku ArthimeticExeption
        if(getRightValue() == 0.00d){
            setResult(0/0);
        }
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }
}
