package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
//        this.grades = grades;
    }

    public String getName(String studentName) {
        return studentName;
    }

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
        Student Boryana = new Student("Ana");
        Boryana.addGrade(80);
        Boryana.addGrade(90);
        System.out.println(Boryana.getGradeAverage());
    }
}

