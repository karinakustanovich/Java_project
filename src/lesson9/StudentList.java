package lesson9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentList {
    public static void main(String[] args) {

        Student stud = new Student("Student", 35);

        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(stud);

        HashMap<String, Integer> students = new HashMap<>();

        for (Map.Entry<String, Integer> student : students.entrySet()) {

            studentsList.add(new Student(student.getKey(), student.getValue()));

        }
        studentsList.forEach(student -> System.out.println(student.getName()));
        studentsList.forEach(student -> System.out.println(student.getAge()));
        studentsList.forEach(student -> System.out.println(student));
    }
}
