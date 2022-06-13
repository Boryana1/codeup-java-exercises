package grades;

import java.util.HashMap;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Student Bob = new Student("bobby");
        Bob.addGrade(90);
        Bob.addGrade(82);
        Bob.addGrade(89);

        Student Jen = new Student("jennifer");
        Jen.addGrade(76);
        Jen.addGrade(100);
        Jen.addGrade(81);

        Student Annie = new Student("ann");
        Annie.addGrade(86);
        Annie.addGrade(67);
        Annie.addGrade(73);

        Student Jeff = new Student("jeffrey");
        Jeff.addGrade(87);
        Jeff.addGrade(100);
        Jeff.addGrade(90);

        Student Adam = new Student("adam");
        Adam.addGrade(78);
        Adam.addGrade(87);
        Adam.addGrade(96);

        HashMap<String, Student> GitHubStudentName = new HashMap<>();

        GitHubStudentName.put("bobby", Bob);
        GitHubStudentName.put("jennifer", Jen);
        GitHubStudentName.put("ann", Annie);
        GitHubStudentName.put("jeffrey", Jeff);
        GitHubStudentName.put("adam", Adam);
        Scanner scanner = new Scanner(System.in);
        String tryAgain = "";

        do {
            System.out.println("Here are the GitHub usernames of our students: ");
            System.out.println(GitHubStudentName.keySet());
            System.out.println("How do you want to see more information about?");
            String userChoice = scanner.next();

            if (userChoice.equalsIgnoreCase("bobby")) {

                System.out.println("Name: " + GitHubStudentName.get("bobby").getName() + " - " + "Github Username: bobby");
                System.out.println("Current Average: " + GitHubStudentName.get("bobby").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("jennifer")) {

                System.out.println("Name: " + GitHubStudentName.get("jennifer").getName() + " - " + "Github Username: jennifer");
                System.out.println("Current Average: " + GitHubStudentName.get("jennifer").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("ann")) {

                System.out.println("Name: " + GitHubStudentName.get("ann").getName() + " - " + "Github Username: ann");
                System.out.println("Current Average: " + GitHubStudentName.get("ann").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("jeffrey")) {

                System.out.println("Name: " + GitHubStudentName.get("jeffrey").getName() + " - " + "Github Username: jeffrey");
                System.out.println("Current Average: " + GitHubStudentName.get("fmendozajeffreyro").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("adam")) {

                System.out.println("Name: " + GitHubStudentName.get("adam").getName() + " - " + "Github Username: adam");
                System.out.println("Current Average: " + GitHubStudentName.get("adam").getGradeAverage());


            } else {
                scanner.next();
                System.out.println("Error, there is no such GitHub username.");
            }
            System.out.println("Do you want to try again? (y/n)");
            tryAgain = scanner.next();

        } while (tryAgain.equalsIgnoreCase("y"));

        System.out.println("Bye");


    }

}

