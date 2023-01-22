package lesson11.person;

public class Student extends Person {

    private double grade;

    public Student(String firstName, String lastName, int age, boolean isJewish, double grade) {
        super(firstName, lastName, age, isJewish);
        this.grade = grade;
    }

    public Student(String lastName, int age, double grade) {
        super(lastName, age);
        this.grade = grade;
    }

    public Student(double grade) {
        this.grade = grade;
    }

    @Override
    public void whatIsYourName() {
        System.out.println("I'm a student, my name is " + getFirstName());
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a student");
    }


}
