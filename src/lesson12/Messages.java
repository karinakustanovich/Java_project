package lesson12;

import java.util.ArrayList;
import java.util.List;

public class Messages {

    public static void printMainMenu() {
        System.out.println("\nPlease choose from the next Menu:");
        System.out.println("1. Add new shape");
        System.out.println("2. List all shapes");
        System.out.println("3. Sum all circumferences");
        System.out.println("4. Sum all areas");
        System.out.println("5. Find the biggest circumference");
        System.out.println("6. Find the biggest area");
        System.out.println("7. Exit");
    }

    public static void printShapesMenu() {
        System.out.println("\nPlease choose from the next Shapes:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Right triangle");
    }

    public static void printCollection(List<Shape> list) {

        if (list.size() == 0) {
            System.out.println("There are no shapes in list");
            return;
        }
        list.forEach(shape -> System.out.println(shape));
    }
}