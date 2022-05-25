package shapes;

//TODO: Create a class named Square that extends Rectangle. Square should define a constructor that accepts one argument,
// side, and calls the parent's constructor to set both the length and width to the value of side.
public class Square extends Rectangle{
    private int side;
    public void Square(int side){
        this.side = side;
        super.Rectangle(side, side);
        }
    }

