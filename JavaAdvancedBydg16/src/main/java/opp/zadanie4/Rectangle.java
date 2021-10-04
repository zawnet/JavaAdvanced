package opp.zadanie4;

import opp.zadanie4.Exceptions.NegativeValueException;

public class Rectangle extends  Shape{
    protected double width = 1.0d;
    protected double length = 1.0d;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() throws  NegativeValueException{
        if(width < 0 || length < 0){
            throw new NegativeValueException("Error length or  width value cannot be negative");
        }
        else {
            return getWidth() * getLength();
        }
    }

    @Override
    public double getPerimeter() throws NegativeValueException{
        if(width < 0 || length < 0){
            throw new NegativeValueException("Error length or  width value cannot be negative");
        }
        else {
            return (2 * getWidth()) + (2 * getLength());
        }
    }
}
