package lesson9;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("Alex", 34);

        System.out.println(student.getName());
        System.out.println(student.getAge());

        student.setAge(25);
        student.setName("Donald");
        System.out.println(student);

        student.setAge(3);
        System.out.println(student);


    }
}
