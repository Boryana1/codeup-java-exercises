package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

//    public String getName() {
//        return this.name;
//    }

    public void addGrade(int grade) {
         grades.add(grade);
    }

    public double getGradeAverage() {
        int addedGrades = 0;
        for (int i = 0; i < grades.size(); i++) {
            addedGrades += grades.get(i);
        }
        return (double) addedGrades / (double) grades.size();
    }

    public static void main(String[] args) {
//        Student Boryana = new Student("Ana");
//        Boryana.addGrade(80);
//        Boryana.addGrade(90);
//        System.out.println(Boryana.getGradeAverage());
    }
}

