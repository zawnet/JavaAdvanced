package opp.math;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private OperationCode operationCode;
    private double result;

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public void setOperationCode(OperationCode operationCode) {
        this.operationCode = operationCode;
    }

    public double getResult() {
        return result;
    }

    public void execute(){
        CalculateBase calcuate;
        switch (operationCode){
            case ADD:
                calcuate = new Adder(leftValue, rightValue);
                calcuate.calculate();
                result = calcuate.getResult();
                break;
            case SUBSTRACT:
                calcuate = new Substracter(leftValue,rightValue);
                calcuate.calculate();
                result = calcuate.getResult();
                break;
            case MULTIPLY:
                calcuate = new Multiplier(leftValue,rightValue);
                calcuate.calculate();
                result = calcuate.getResult();
            case DIVIDE:
                calcuate = new Divider(leftValue, rightValue);
                calcuate.calculate();
                result = leftValue / rightValue;
                break;
            default:
                System.out.println("Onvalid operation code: "+operationCode);
                result = 0.0d;
                break;
        }
    }

}
