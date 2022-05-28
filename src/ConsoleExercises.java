import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
//TODO: 1.Write some Java code that uses the variable pi to output the following: The value of pi is approximately 3.14.
        System.out.format("The value of pi is approximately %s\n", pi );

//TODO: Explore the Scanner Class.
//TODO: 1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int input = scanner.nextInt();
//        System.out.println(input);

//TODO: 2.Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        Scanner scannerWords = new Scanner(System.in);
//        System.out.println("Enter 3 words: ");
//        String word1 = scannerWords.next();
//        String word2 = scannerWords.next();
//        String word3 = scannerWords.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//TODO: 3.Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        Scanner sentence = new Scanner(System.in);
//        System.out.println("Enter a sentence:\n");
//        String enteredSentence = sentence.nextLine();
//        System.out.println(enteredSentence);

//TODO: Calculate the perimeter and area of Codeup's classrooms.
//TODO: 1.Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual). //Use the nextLine method each time
// you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width.
// Parse the resulting strings to a numeric type.
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the length of your room:\n");
        String length = number.nextLine();
        System.out.println("Enter the width of your room:\n");
        String width = number.nextLine();

//Assume that the rooms are perfect rectangles.
//Assume that the user will enter valid numeric data for length and width.

//TODO: 2.Display the area and perimeter of that classroom.
        int perimeter =  (Integer.valueOf(width) * 2) + (Integer.valueOf(length) * 2);
        int area = (Integer.valueOf(width)) * (Integer.valueOf(length));
        System.out.format("The perimeter of a room with length of %s and width of %s is %s.\n", length, width, perimeter);
        System.out.format("The area of a room with length of %s and width of %s is %s.", length, width, area);
    }
    }


