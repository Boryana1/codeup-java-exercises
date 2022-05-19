import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Talk to Bob:");
        String myStringInput = userInput.nextLine();
        if (myStringInput.endsWith("?")) {
            System.out.println("Sure");
        }else if (myStringInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (myStringInput == myStringInput.toUpperCase()){
            System.out.println("Whoa, chill out!");
        } else{
            System.out.println("Whatever.");
        }
    }
}
