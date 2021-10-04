import opp.zadanie4.Circle;
import opp.zadanie4.Exceptions.NegativeValueException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    private Circle circle;

    @Test
    public void getAreaTest(){
        circle = new Circle(2.00d);
        double result = 0.0d;

        try {
            result = circle.getArea();
        }
        catch (NegativeValueException ex){
            System.out.println(ex.getMessage());
        }
        assertEquals(Math.PI*Math.pow(circle.getRadius(),2),result);
    }

    @Test
    public void getPerimeterTest(){
        circle = new Circle(1.20d);
        double result = 0.0d;

        try {
            result = circle.getPerimeter();
        }
        catch (NegativeValueException ex){
            System.out.println(ex.getMessage());
        }
        assertEquals(2*Math.PI*circle.getRadius(),result);
    }
}
