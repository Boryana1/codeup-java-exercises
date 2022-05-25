package shapes;

//TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method.
//   -->> verify that the getPerimeter and getArea methods return 20 and 25, respectively.
public class ShapesTest {
    static Rectangle box1 = new Rectangle();
    static Square box2 = new Square();

//TODO: Inside the main method:
    public static void main(String[] args) {

//TODO:-> create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        box1.Rectangle(5,4);
        System.out.println("The parameter of the rectangle is: " + box1.getParameter());
        System.out.println("The area of the rectangle is: " + box1.getArea());

//TODO: -> create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        box2.Square(5);
        System.out.println("The parameter of the square is: " + box2.getParameter());
        System.out.println("The area of the square is: " + box2.getArea());
    }
}
