package lesson4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter your age...");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("You're adult");

        }
        else if (age == 18) {
            System.out.println("You're 18 years old");
            System.out.println("Bye");
        }
        else {
            System.out.println("You're young");
        }
    }
}
