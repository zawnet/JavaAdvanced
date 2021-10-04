package opp.math;

import opp.math.MathProcessing;

public abstract class CalculateBase implements MathProcessing {
    private double leftValue;
    private double rightValue;
    private double result;

    public CalculateBase(double leftValue, double rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public CalculateBase() {
    }

    public void setLeftValue(double leftValue) {
        this.leftValue = leftValue;
    }

    public void setRightValue(double rightValue) {
        this.rightValue = rightValue;
    }

    protected double getLeftValue() {
        return leftValue;
    }

    protected double getRightValue() {
        return rightValue;
    }

    public double getResult() {
        return result;
    }

    protected void setResult(double result) {
        this.result = result;
    }

    public abstract void calculate();
}