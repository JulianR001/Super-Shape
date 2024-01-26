
/**
 * Write a description of class house here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class house extends Shape {
    square base;
    Triangle roof;
    
    public house(String colour, boolean fill, double sideLength) {
        super(colour, fill);
        base = new square(sideLength, colour, fill );
        roof = new Triangle(sideLength, sideLength, sideLength, colour, fill);
    }
    
    @Override
    public double CalculateArea() {
        return base.CalculateArea() + roof.CalculateArea();
    }

    @Override
    public double CalculatePerimeter() {
        return base.getlength() * 5;
    }

    public double getSize() {
        return base.getlength();
    }
    
    public void setSize(double s) {
        base = new square(s, getColour(), fillment());
        roof = new Triangle(s, s, s, getColour(), fillment());
    }
    
}
    

