package lesson5;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100");
        int value = scanner.nextInt();

        if (value >= 0 && value < 15) {
            System.out.println("Число в промежутке от 0 до 14");
        } else if (value >= 15 && value < 36) {
            System.out.println("Число в промежутке от 15 до 35");
        } else if (value >= 36 && value < 51) {
            System.out.println("Число в промежутке от 36 до 50");
        } else if (value >= 51 && value < 101) {
            System.out.println("Число в промежутке от 51 до 100");
        } else System.out.println("Число не входит в промежуток от 0 до 100");
    }
}
