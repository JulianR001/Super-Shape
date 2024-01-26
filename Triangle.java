
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape {
   private double side1;
   private double side2;
   private double side3;
   
   public Triangle(double one, double two, double three, String colour, boolean fill) {
       super(colour, fill);
       setSide1(one);
       setSide2(two);
       setSide3(three);
   }
   public void setSide1(double one) {
       this.side1 = one;
   }
   public void setSide2(double two) {
       this.side2 = two;
   }
   public void setSide3(double three) {
       this.side3 = three;
   }
   public double getside1() {
       return side1;
   }
   public double getside2() {
       return side2;
   }
   public double getside3() {
       return side3;
   }
   @Override
    public double CalculateArea() {
        double s = CalculatePerimeter()/2;
        return Math.sqrt(((s*(s - side1))*(s - side2))*(s - side3));
    }

    @Override
    public double CalculatePerimeter() {
        return side1 + side2 + side3;
    }
}
