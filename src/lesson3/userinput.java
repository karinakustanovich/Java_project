package lesson3;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        String name;
        int age;
        double grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = input.nextLine();
        System.out.println("Please enter your age: ");
        age = input.nextInt();

        System.out.println("Please enter your grade: ");
        grade = input.nextDouble();


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
        System.out.println("Finished");


    }
}
