package opp.math;

import opp.exeptions.InvalidStatementException;

public class DynamicHelpers {

    private final MathProcessing[] handlers;



    public DynamicHelpers(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public void doProcess(String statement) throws InvalidStatementException{

        try {
            process(statement);
        }
        catch (InvalidStatementException ex){
            throw ex;
            //System.out.println("Error executing statement: "+ex.getMessage());
        }
        catch (ArithmeticException ex){
            throw new InvalidStatementException("Error executing statement: "+ex.getMessage(), ex);
            //System.out.println();
        }

    }
    private void process (String statement) throws InvalidStatementException{
        //add 2 2
        String[] parts = statement.split(MathProcessing.SEPARATOR);
        if(parts.length != 3 ){
            throw new InvalidStatementException(
                    "Statement must have 3 parts: operation leftValue");
        }
        String operation = parts[0];
        double leftValue = Double.parseDouble(parts[1]);
        double rightValue = Double.parseDouble(parts[2]);

        MathProcessing theHandler = null;
        for (MathProcessing handler : handlers) {
            if (operation.equalsIgnoreCase(handler.getOperationCode().toString())) {
                theHandler = handler;
                break;
            }
        }

        if (theHandler == null) {
            System.out.println("Unknown operation");
        } else {
            double result = theHandler.doCalcuoations(leftValue, rightValue);
            System.out.println("result = " + result);
        }

    }
}
