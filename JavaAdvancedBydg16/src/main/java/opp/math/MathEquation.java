package opp.math;

public class MathEquation {
    private double leftValue;
    private double rightValue;
    private char operationCode; //'a', 's', 'm', ''d
    private double result;

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public void setOperationCode(char operationCode) {
        this.operationCode = operationCode;
    }

    public double getResult() {
        return result;
    }

    public void execute(){
        CalcualtorBase calcualtorBase;
        switch (operationCode){
            case 'a':
                calcualtorBase = new Adder(leftValue, rightValue);
                calcualtorBase.calculate();
                result = calcualtorBase.getResult();
                break;
            case 's':
                calcualtorBase = new Substracter(leftValue,rightValue);
                calcualtorBase.calculate();
                result = calcualtorBase.getResult();
                break;
            case 'm':
                calcualtorBase = new Multiplier(leftValue,rightValue);
                calcualtorBase.calculate();
                result = calcualtorBase.getResult();
            case '/':
                result = leftValue / rightValue;
                break;
            default:
                System.out.println("Onvalid operation code: "+operationCode);
                result = 0.0d;
                break;
        }
    }

}
