import java.util.Arrays;
import java.util.List;
//import wagu.Block;
//import wagu.Board;
//import wagu.Table;

public class ControlFlowExercises {
    public static void main(String[] args) {

//    1.Loop Basics
//      a. While:
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//
////        b. Do While:
//        int a = 105;
//        do {
//            a -= 5;
//            System.out.println(a);
//        }while(a > -10);

//        long b = 2;
//        do {
//            System.out.println(b);
//            b *= b;
//        }while(b < 1000000);

//      c. For loop:
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i > -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        2.Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println(i +" FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println(i + " Fizz");
//            }else if(i % 5 == 0){
//                System.out.println(i +" Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }

//        3. Display a table of powers

        Scanner num = new Scanner(System.in);
        System.out.println("What number would you like to go up to? You can choose from 1 to 10.");
        int number = num.nextInt();
        String company = "";
        List<String> t1Headers = Arrays.asList("number", "CUSTOMER");
        List<List<String>> t1Rows = Arrays.asList(
                Arrays.asList("DATE: 2015-9-8", "ModernTec Distributors"),
                Arrays.asList("TIME: 10:53:AM", "MOB: +94719530398"),
                Arrays.asList("BILL NO: 12", "ADDRES: No 25, Main Street, Kandy."),
                Arrays.asList("INVOICE NO: 458-80-108", "")
        );
//        System.out.format("%32s%10d%16s", string1, int1, string2);


    }
}
