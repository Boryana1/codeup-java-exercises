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
        if((str.toLowerCase() == "y") || (str.toLowerCase() == "yes")) {
        return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %s and %s: \n", min, max);
        int num = newInput.nextInt();
        if((num > min) && (num < max)){
            System.out.println("That is my favorite number!");
        }else{
            return getInt();
        }
        return num;
    }

    public int getInt() {
        System.out.println("This is the getInt method");
        return newInput.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a floating-point number between %s and %s:\n", min, max);
        double num = newInput.nextDouble();
        if((num > min) && (num < max)){
            System.out.println("That is my favorite floating-point number!");
        }else{
            return getDouble();
        }
        return num;
    }

    public double getDouble() {
        System.out.println("This is the getDouble method");
        return newInput.nextDouble();
    }
}
