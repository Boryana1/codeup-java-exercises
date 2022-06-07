package shapes;

//TODO: Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length
// and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

public class Rectangle extends Quadrilateral implements Measurable{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double setLength(double length) {
        return length;
    }

    @Override
    public double setWidth(double width) {
        return width;
    }



//TODO: // Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
// The formulas for both follow:
// perimeter = 2 x length + 2 x width
// area = length x width

    public double getParameter() {
        return 2 * length + 2 * width;
    }
    public double getArea(){
        return length * width;
    }
}
