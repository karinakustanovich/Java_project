package lesson5;

import java.util.Scanner;

public class loginpassword {
    public static void main(String[] args) {

        String login = "Karina";
        String password = "Meow";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String usedlogin = scanner.nextLine();

        System.out.println("Введите пароль: ");
        String usedpass = scanner.nextLine();

        if (usedlogin.equals(login) && usedpass.equals(password)) {
            System.out.println("Вы вошли в систему.");
        } else {
            for (int i = 0; i < 6; i++) {
                if (i < 6) {
                    if (usedlogin.equals(login) && usedpass.equals(password)) {
                        System.out.println("Вы вошли в систему.");
                        break;
                    } else {
                        System.out.println("Данные не верны. Введите еще раз: ");
                        System.out.println("Введите логин: ");
                        usedlogin = scanner.nextLine();
                        System.out.println("Введите пароль: ");
                        usedpass = scanner.nextLine();
                    }
                } else {
                    System.out.println("Ошибка, отказано в доступе. ");
                }
            }
        }
    }
}
