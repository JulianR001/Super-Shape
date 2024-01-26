
/**
 * Write a description of class pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class pentagon extends Shape {
    private double length;
     public pentagon(double l, String colour, boolean fill) {
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
        double X = Math.sqrt(5*(5 + (2*Math.sqrt(5))));
        return (X*(length*length))/4.0;
    }

    @Override
    public double CalculatePerimeter() {
        return length*5;
    }
}

