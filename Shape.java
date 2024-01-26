
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
   private String ShapeColour = new String();
   private boolean isFilled;
   
   public Shape(String colour, boolean fill) {
       ShapeColour = colour;
       isFilled = fill;
   }
   public double CalculateArea() {
       return 1.0;
   }
   public double CalculatePerimeter() {
       return 1.0;
   }
   public void Display() {
       System.out.println("the colour of this shape is " + ShapeColour + ", Fill status = " + isFilled);
   }
   public String getColour() {
       return ShapeColour;
   }
   public boolean fillment() {
       return isFilled;
   }
   public void setColour(String newColour) {
    ShapeColour = newColour;
    }
    public void setFill(boolean fillment) {
    isFilled = fillment;
    }
}
