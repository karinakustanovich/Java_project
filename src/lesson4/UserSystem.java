package lesson4;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String login = "Admin";
        String password = "P@ssword";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter login:");
        login = input.nextLine();

        if (login.equals("Admin")) {
            System.out.println("Enter password:");
            password = input.nextLine();

            if (password.equals("P@ssword"))
                System.out.println("Здравствуйте, " + login + ", Вы вошли в систему.");
            else {
            System.out.println("Вы ввели неверный пароль!");
        }}
        else {
            System.out.println("Нет пользователя с таким именем!");
        }
    }
}