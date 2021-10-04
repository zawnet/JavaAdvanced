package opp.exeptions;

public class Main {
    public static void main(String[] args) {
        int i = 12;
        int j = 5;

        try{
            int result = i / (j - 2);
            System.out.println(result);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Jesteśmy w finally");
        }

        System.out.println("Program zakończył się");

    }
}
