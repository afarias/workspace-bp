package math;

/**
 * Created by Admin on 14/04/2016.
 */
public class Rectangle implements IFigure {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return length+width*2;
    }

    @Override
    public double area() {
        return length*width;
    }

}
