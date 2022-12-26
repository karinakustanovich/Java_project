package lesson4;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number...");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное.");
        }
        
        else {
            System.out.println("Число " + number + " нечетное.");
        }
    }
}
