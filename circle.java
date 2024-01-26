
/**
 * Write a description of class circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class circle extends Shape {
    private double radius;
    public circle(double radius, String colour, boolean fill) {
      super(colour, fill);
      this.radius = radius;
    }
  public void setRadius(double radius) {
      this.radius = radius;
  }
  public double getRadius() {
      return this.radius;
  }
  @Override
  public double CalculateArea() {
       return Math.PI*(this.radius*this.radius);
   }
   @Override
   public double CalculatePerimeter() {
       return 2*(Math.PI*radius);
   }
}
