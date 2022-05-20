package util;
import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class InputTest {
//    private Scanner newInput = new Scanner(System.in);
    public static void main(String[] args) {
        int minInt = 1;
        int maxInt = 10;
        double min = 1.1;
        double max = 10.1;
        Input in = new Input();
        in.getString();
        in.yesNo();
        in.getInt(minInt, maxInt);
        in.getInt();
        in.getDouble(min, max);
        in.getDouble();
    }
}
