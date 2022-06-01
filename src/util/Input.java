package util;
import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner newInput = new Scanner(System.in);

    public String getString() {
        System.out.println("Enter your name:");
        return newInput.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Do you like coding? [y/n]");
        String str = newInput.nextLine();
        if ((str.toLowerCase() == "y") || (str.toLowerCase() == "yes")) {
            return true;
        } else {
            return false;
        }
    }

//    public int getInt(int min, int max) {
//        System.out.printf("Enter a number between %s and %s: \n", min, max);
//        int num = newInput.nextInt();
//        if((num > min) && (num < max)){
//            System.out.println("That is my favorite number!");
//        }else{
//            return getInt();
//        }
//        return num;
//    }
//
//    public int getInt() {
//        System.out.println("This is the getInt method");
//        return newInput.nextInt();
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.printf("Enter a floating-point number between %s and %s:\n", min, max);
//        double num = newInput.nextDouble();
//        if((num > min) && (num < max)){
//            System.out.println("That is my favorite floating-point number!");
//        }else{
//            return getDouble();
//        }
//        return num;
//    }
//
//    public double getDouble() {
//        System.out.println("This is the getDouble method");
//        return newInput.nextDouble();
//    }
//}
//TODO: Improve your Input class. Your getInt and getDouble methods should make sure that the value returned from
// the method is actually an int or a double. You can do this by replacing the use of the Scanner nextInt() and nextDouble()
// methods with the existing getString() method you created in a previous exercise using the following methods to convert
// the returned String into the desired datatype:
// Integer.valueOf(String s);
// Double.valueOf(String s);
// Note these methods will throw a NumberFormatException if the given input cannot be parsed as an int or double.
// Your methods on the Input class should handle these exceptions, you can use a try-catch for this.

    public int getInt() throws Exception{
        System.out.println("Enter a random number:\n");
        String num = newInput.next();
        int getNumber = 0;
        try {
            getNumber = Integer.valueOf(num);
        } catch (Exception e) {
            getInt();
        }
        return getNumber;
    }


    public double getDouble() throws Exception{
        System.out.printf("Enter a floating-point number:\n");
        String num = newInput.next();
        double getNumber = 0;
        try {
            getNumber = Double.valueOf(num);
        } catch (Exception e) {
            getDouble();
        }
        return getNumber;
    }
}

