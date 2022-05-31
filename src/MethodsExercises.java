public class MethodsExercises {
//TODO: 1. Create four separate methods. Each will perform an arithmetic operation:
// Addition
// Subtraction
// Multiplication
// Division
// 1. a) Each function needs to take two parameters/arguments so that the operation can be performed.
    public static long add(int number1, int number2){
    return number1 + number2;
}
    public static long subtract(int number3, int number4){
        return number3 - number4;
    }
    public static long multiply(int number5, int number6){
        return (long) number5 * number6;
    }
    public static double divideNum(double number7, double number8){
        return (number7 / number8);
    }

//TODO: Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
// If not, prompt the user to input their number again until the input is within range. The method signature should look like this:
// public static int getInteger(int min, int max);
// and is used like this:
// System.out.print("Enter a number between 1 and 10: ");
// int userInput = getInteger(1, 10);
// If the input is invalid, prompt the user again.

public static void main(String[] args) {
    System.out.println(add(1, 2));
    System.out.println(subtract(3, 4));
    System.out.println(multiply(5, 6));
    System.out.println(divideNum(7, 8));

}
}
