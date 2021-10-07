package opp.zadanie3;

public class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new Point(x1,y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }

    public double getPerimeter(){
        double perimeter = Math.sqrt(Math.pow(v2.getX() - v1.getX(),2) + Math.pow(v2.getY() - v1.getY(),2)) +
                Math.sqrt(Math.pow(v3.getX() - v2.getX(),2) + Math.pow(v3.getY() - v2.getY(),2)) +
                Math.sqrt(Math.pow(v3.getX() - v1.getX(),2) + Math.pow(v3.getY() - v1.getY(),2));

        return perimeter;
    }

    public double getArea(){
        double area = 0.5 * Math.abs(
                ( (v2.getX() - v1.getX()) * (v3.getY() - v1.getY()) ) -
                ( (v2.getY() - v1.getY()) * (v3.getX() - v1.getX()) )
        );
        return area;
    }


}
