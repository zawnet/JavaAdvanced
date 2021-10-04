package opp.math;

import opp.exeptions.InvalidStatementException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MathProgram {

    private static String FILE_NAME = "operations.txt";
    public static void main(String[] args) {

//        MathEquation[] mathEquations = new MathEquation[4];
//        mathEquations[0] = create(100.00d,50.00d,'d');
//        mathEquations[1] = create(25.00d,92.00d,'a');
//        mathEquations[2] = create(225.00d,25.00d,'s');
//        mathEquations[3] = create(11.00d,4.00d,'m');

//        for (MathEquation mathEquation : mathEquations ){
//            mathEquation.execute();
//            System.out.println("result = "+mathEquation.getResult());
//        }

        //Scanner scanner = new Scanner(System.in);
        //add 2 2
        //System.out.println("Enter an operation and two numbers");
       // String userINput = scanner.nextLine();

        DynamicHelpers helper = new DynamicHelpers(new MathProcessing[] {
                new Adder(),
                new Substracter(),
                new Divider(),
                new Multiplier()
                //new Multiplier()
        });

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null){
                System.out.println(inputLine);
                try {
                    helper.doProcess(inputLine);
                }
                catch (InvalidStatementException ex){
                    System.out.println("Error invalid statement: "+ex.getMessage());
                    if(ex.getCause() != null){
                        System.out.println(" caused by "+ ex.getCause());
                    }
                }

            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found: "+ FILE_NAME);
        }
        catch (IOException ex){
            System.out.println("Error reading file: "+ ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Error processing file: " + ex.getMessage() );
        }
        //helper.process(userINput);
    }

    public  static MathEquation create(double leftValue, double rightValue, OperationCode operation){
        MathEquation mathEquation = new MathEquation();
        mathEquation.setLeftValue(leftValue);
        mathEquation.setRightValue(rightValue);
        mathEquation.setOperationCode(operation);
        return  mathEquation;
    }
}
