package zadanie3;
import opp.zadanie3.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TriangleTest {

    Triangle triangle;
    @BeforeEach
    public void beforeEach(){
        triangle = new Triangle(1,3,4,0,-2,1);
    }

    @Test
    public void getPerimeterTest(){
        double perimeter = Math.round( (3*Math.sqrt(2)+Math.sqrt(37)+Math.sqrt(13)) *100)/100;
        assertEquals(perimeter, Math.round(triangle.getPerimeter()*100)/100);

    }

    @Test
    public void getAreaTest(){
        double area = 7.5;
        assertEquals(area,triangle.getArea());
    }
}
