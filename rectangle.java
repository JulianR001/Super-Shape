
/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle extends Shape {
    private double length;
    private double width;
    public rectangle(double l, double w, String colour, boolean fill) {
        super(colour, fill);
        setlength(l);
        setWidth(w);
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public void setlength(double l) {
        this.length = l;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double CalculateArea() {
        return length*width;
    }

    @Override
    public double CalculatePerimeter() {
        return (length*2) + (width*2);
    }
}
