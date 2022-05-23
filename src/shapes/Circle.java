package shapes;

import java.util.Scanner;

public class Circle {
//        Scanner scanARadius = new Scanner(System.in);
        private final double radius;

        public Circle(double radius) {
                this.radius = radius;
        }

        public double getRadius() {
                return radius;
        }
        public double getArea(){
                return Math.PI * Math.pow(radius, 2);
        }
        public double getCircumference() {
                return (2 * Math.PI * radius);
        }
}
