package shapes;
import java.util.Scanner;

//TODO: Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length
// and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

public class Rectangle {
    private int length;
    private int width;

    public void Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
//TODO: // Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
// The formulas for both follow:
// perimeter = 2 x length + 2 x width
// area = length x width

    public int getParameter() {
        return 2 * length + 2 * width;
    }
    public int getArea(){
        return length * width;
    }
//    public double getCircumference() {
//        return (2 * Math.PI * radius);
//    }
}
