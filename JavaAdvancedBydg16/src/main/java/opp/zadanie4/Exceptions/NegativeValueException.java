package opp.zadanie4.Exceptions;

public class NegativeValueException extends Exception{

    public NegativeValueException(String message) {
        super(message);
    }

    public NegativeValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
