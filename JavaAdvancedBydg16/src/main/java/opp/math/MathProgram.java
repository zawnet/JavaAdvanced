package opp.math;

public class MathProgram {
    public static void main(String[] args) {

        MathEquation[] mathEquations = new MathEquation[4];
        mathEquations[0] = create(100.00d,50.00d,'d');
        mathEquations[1] = create(25.00d,92.00d,'a');
        mathEquations[2] = create(225.00d,25.00d,'s');
        mathEquations[3] = create(11.00d,4.00d,'m');

        for (MathEquation mathEquation : mathEquations ){
            mathEquation.execute();
            System.out.println("result = "+mathEquation.getResult());
        }

    }

    public  static MathEquation create(double leftValue, double rightValue, char operation){
        MathEquation mathEquation = new MathEquation();
        mathEquation.setLeftValue(leftValue);
        mathEquation.setRightValue(rightValue);
        mathEquation.setOperationCode(operation);
        return  mathEquation;
    }
}
