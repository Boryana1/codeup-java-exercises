package shapes;

//TODO: Create a class named Square that extends Rectangle. Square should define a constructor that accepts one argument,
// side, and calls the parent's constructor to set both the length and width to the value of side.
public class Square extends Quadrilateral{
    private double side;
    public Square(double side){
        super( side, side);
        this.side = side;
        }
////TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
    @Override
    public double getParameter() {
        return 4 * side;
    }

    public double getArea(){
        return Math.pow(side, 2);
    }

    @Override
    public double setLength(double side) {
        return side;
    }

    @Override
    public double setWidth(double side) {
        return side;
    }
}

