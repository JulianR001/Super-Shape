
/**
 * Write a description of class Shape_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape_test
{
    Shape circ = new circle(5.0, "purp", true);
    Shape trian = new Triangle(3.0, 3.0, 5.0, "green", false);
    Shape square = new square(6.0, "red", true);
    Shape pentagon = new pentagon(10.0, "purple", true);
    Shape Rectangle = new rectangle(4.0, 10, "pink", false);
    Shape House = new house("white", true, 20.0);
    Shape[] myArray = new Shape[6];   
    public void main(String[] args) {
    
        myArray[0] = circ;
        myArray[1] = trian;
        myArray[2] = square;
        myArray[3] = pentagon;
        myArray[4] = Rectangle;
        myArray[5] = House;
        for(int i = 0; i < 6; i++) { 
            System.out.println("Area of " + i + " = " + myArray[i].CalculateArea());
        }
        for(int i = 0; i < 6; i++) { 
            System.out.println("Perimeter of " + i + " = " + myArray[i].CalculatePerimeter());
        }
    }

    
}