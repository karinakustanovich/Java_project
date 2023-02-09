package lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions03UnControlledRunTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = null;
        String lastName = "Komanov";
        try {
            System.out.println("What is your age: ");
            int age = input.nextInt();
            // In case of exception - this part of code will be not executed
            System.out.println("age = " + age);

        }
        catch (InputMismatchException exception) {
            System.out.println("Чувак ты что это же вопрос про возраст!");
            exception.printStackTrace();
        }

        System.out.println(lastName.length());

    }
}
