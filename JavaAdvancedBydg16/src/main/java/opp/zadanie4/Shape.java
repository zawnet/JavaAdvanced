package opp.zadanie4;

import opp.zadanie4.Exceptions.NegativeValueException;

public abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea() throws NegativeValueException;

    public abstract double getPerimeter() throws NegativeValueException;

}
