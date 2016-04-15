package math;

import java.lang.reflect.Array;

/**
 * Created by Admin on 14/04/2016.
 */
public class MonProgrammeMath {
    public static void main(String[] args) {
        IFigure rectangle1 = new Rectangle(2, 5);
        IFigure rectangle2 = new Rectangle(3, 600);
        IFigure square1 = new Square(33);
        IFigure square2 = new Square(8646373929.0);
        IFigure circle1 = new Circle(8646373929.0);
        IFigure circle2 = new Circle(1);

        IFigure myArray[] = {rectangle1,rectangle2,square1,square2,circle1,circle2};

        double perimeterSum = 0;
        for (IFigure aFigure : myArray) {
            double aFigurePerimeter = aFigure.perimeter();
            perimeterSum = perimeterSum+aFigurePerimeter;
        }
        System.out.println(perimeterSum);
    }
}
