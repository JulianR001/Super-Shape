
/**
 * Write a description of class square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class square extends Shape {
    private double length;
    public square(double l, String colour, boolean fill) {
        super(colour, fill);
        setlength(l);
    }

    public void setlength(double l) {
        this.length = l;
    }
    public double getlength() {
        return length;
    }
    @Override
    public double CalculateArea() {
        return length*length;
    }

    @Override
    public double CalculatePerimeter() {
        return length*4;
    }
}
