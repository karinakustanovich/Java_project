package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShapes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Shape> collectionOfShapes = new ArrayList<>();

        Messages.printMainMenu();
        int option = input.nextInt();

        while (option > 0 && option < 8) {

            System.out.println("You have chosen " + option);
            switch (option) {
                case 1:
                    Messages.printShapesMenu();
                    int subOption = input.nextInt();
                    System.out.println("Choose your color");
                    String color = input.next();
                    switch (subOption) {
                        case 1:
                            System.out.println("Enter square side");
                            collectionOfShapes.add(new Square(color, input.nextDouble()));
                            break;
                        case 3:
                            System.out.println("Enter circle radius");
                            collectionOfShapes.add(new Circle(color, input.nextDouble()));
                            break;


                    }
                    break;
                case 2:
                    Messages.printCollection(collectionOfShapes);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
            }
            Messages.printMainMenu();
            option = input.nextInt();
        }

        System.out.println("Good Bye...");
    }
}