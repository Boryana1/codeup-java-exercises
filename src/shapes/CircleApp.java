package shapes;
import java.util.Scanner;

public class CircleApp {
//    public static void main(String[] args) {
//        Circle myCircle = new Circle();
//        myCircle.getRadius();
//        myCircle.Circle(myCircle.getRadius());
//        myCircle.getCircumference();
//        myCircle.getArea();
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the radius of the circle?");
    final double radius = scanner.nextDouble();

    Circle myCircle = new Circle(radius);
    System.out.println("The radius of the circle is " + myCircle.getRadius());
    System.out.println("The area of the circle is " + myCircle.getArea());
    System.out.println("The circumference of the circle is " + myCircle.getCircumference());
}
}
