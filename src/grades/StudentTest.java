package grades;

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

//    Create a class named GradesApplication with a main method. Inside the main method,
//    create a HashMap named students. It should have keys that are strings that represent github usernames,
//    and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//            Be creative! Make up GitHub usernames and grades for your student objects.
}
}
