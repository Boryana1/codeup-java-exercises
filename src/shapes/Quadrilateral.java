package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
//TODO: Create protected properties for length and width.
    protected double length;
    protected double width;

//TODO: Create a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
//TODO: Create methods for getting the length and width.
    public double getLength(){
        return length;
    };
    public double getWidth(){
        return width;
    }

//TODO: Create abstract methods for setting the length and width.
    public abstract double setLength();
    public abstract double setWidth();
}
