package lesson9;

import java.util.Scanner;

public class Student {

    String name;
    int age;
    private Scanner input = new Scanner(System.in);

    public Student(String name, int age) {
        while (age < 18 || age > 100){
            System.out.println("Your " + age + " is not valid. Try again...");
            age = input.nextInt();

        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public void setAge(int age) {
        while (age < 18 || age > 100){
            System.out.println("Your " + age + " is not valid. Try again...");
            age = input.nextInt();
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
