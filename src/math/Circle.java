package math;

import java.lang.*;
import java.lang.Math;

import static java.lang.Math.PI;

/**
 * Created by Admin on 14/04/2016.
 */
public class Circle implements IFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2* PI * radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }
}
