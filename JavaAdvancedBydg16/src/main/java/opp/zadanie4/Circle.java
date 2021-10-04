package opp.zadanie4;

import opp.zadanie4.Exceptions.NegativeValueException;

public class Circle extends Shape{
    protected double radius = 1.0d;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() throws NegativeValueException {
        if(radius <= 0) {
            throw new NegativeValueException("Error radius value cannot be negative");
        }
        else {
            return Math.PI*Math.pow(getRadius(),2);
        }

    }

    @Override
    public double getPerimeter() throws NegativeValueException {
        if(radius <= 0) {
            throw new NegativeValueException("Error radius value cannot be negative");
        }
        else {
            return 2 * (Math.PI * getRadius());
        }
    }
}
