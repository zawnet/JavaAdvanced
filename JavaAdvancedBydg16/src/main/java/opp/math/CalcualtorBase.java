package opp.math;

public abstract class CalcualtorBase {
    private double leftValue;
    private double rightValue;
    private double result;

    public CalcualtorBase(double leftValue, double rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    public double getResult() {
        return result;
    }

    protected void setResult(double result) {
        this.result = result;
    }

    public double getLeftValue() {
        return leftValue;
    }

    public double getRightValue() {
        return rightValue;
    }

    public abstract void calculate();
}
