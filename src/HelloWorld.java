import java.util.Scanner;


public class HelloWorld {
        public static void main(String [] args) {
////            1:
//            System.out.println("Hello, World!");
//            int myFavoriteNumber = 2;
//            System.out.println(myFavoriteNumber);
////            2:
//            String myString = "myString";
//            System.out.println(myString);
////            3:
//            myString = "newString";
//            System.out.println(myString);
////            4:
//            myString = String.valueOf(3.14159);
//            System.out.println(myString);
////            5:
//            long myNumber;
////            System.out.println(myNumber);
////            6:
//            myNumber = (long) 3.14;
////            7:
//            myNumber = 123L;
//            System.out.println(myNumber);
////            8:
//            myNumber = 123;
//
//            return myString;
            Scanner newScanner = new Scanner(System.in);
            System.out.println("How old are you?");
            int newInput = newScanner.nextInt();
            int updatedInput = newScanner.nextInt();
            System.out.println(newInput);
            System.out.println(updatedInput);




        }
}

