import java.util.Scanner;

import static java.lang.Integer.getInteger;


public class MethodsExercises {
//TODO: 1. Create four separate methods. Each will perform an arithmetic operation:
// Addition
// Subtraction
// Multiplication
// Division
// 1. a) Each function needs to take two parameters/arguments so that the operation can be performed.

//    public static long add(int number1, int number2){
//    return number1 + number2;
//}
//    public static long subtract(int number3, int number4){
//        return number3 - number4;
//    }
//    public static long multiply(int number5, int number6){
//        return (long) number5 * number6;
//    }
//    public static double divideNum(double number7, double number8){
//        return (number7 / number8);
//    }
//
//    public static int multiplication(int num1, int num2) {
//        int newNum = 0;
//        for(int i = 0; i< num2; i++){
//            newNum += num1;
//        }
//        return newNum;
//    }

//TODO: Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
// If not, prompt the user to input their number again until the input is within range. The method signature should look like this:
// public static int getInteger(int min, int max);
// and is used like this:
// System.out.print("Enter a number between 1 and 10: ");
// int userInput = getInteger(1, 10);
// If the input is invalid, prompt the user again.

//     public static int getInteger(int min, int max){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a number between 1 and 10: ");
//         int userInput = scanner.nextInt();
//         if(userInput > min && userInput <max){
//            return userInput;
//        }else{
//             return getInteger(min, max);
//         }
//     }

//TODO: Calculate the factorial of a number. Prompt the user to enter an integer from 1 to 10.
// Display the factorial of the number entered by the user. Ask if the user wants to continue.
// Use a for loop to calculate the factorial. Assume that the user will enter an integer, but verify it’s between 1 and 10.
// Use the long type to store the factorial. Continue only if the user agrees to.
// A factorial is a number multiplied by each of the numbers before it.
// Factorials are denoted by the exclamation point (n!). Ex:
// 1! = 1               = 1
// 2! = 1 x 2           = 2
// 3! = 1 x 2 x 3       = 6
// 4! = 1 x 2 x 3 x 4   = 24
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 10) {
            int factNum = 1;
            String table = "";
            for (int i = 1; i <= num; i++) {
                factNum *= i;
                table += " " + i + " x";
            }

            String factTable = table.substring(0, (table.length() - 1));
            System.out.printf("%d! = %s = %d", num, factTable, factNum);
        }
    }
public static void main(String[] args) {
//    System.out.println(add(1, 2));
//    System.out.println(subtract(3, 4));
//    System.out.println(multiply(5, 6));
//    System.out.println(divideNum(7, 8));
//
//    getInteger(1, 10);
        factorial();
    }
}
