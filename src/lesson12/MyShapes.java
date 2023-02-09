package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShapes {
    private static ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            Messages.printMainMenu();
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if(choice > 0 && choice < 8) {
                if (choice == 1) {
                    addShape(input);
                } else if (choice == 2) {
                    listShapes();
                } else if (choice == 3) {
                    sumPerimeters();
                } else if (choice == 4) {
                    sumAreas();
                } else if (choice == 5) {
                    findBiggestPerimeter();
                } else if (choice == 6) {
                    findBiggestArea();
                } else if (choice == 7) {
                    System.out.println("Bye, have a good day! :)");
                    break;
                }
            }else {
                System.out.println("Please, choose one of points menu");
            }
        }

        input.close();
    }

    private static void addShape(Scanner input) {
        Messages.printShapesMenu();
        System.out.print("Enter your choice: ");
        int shapeChoice = input.nextInt();
        input.nextLine();

        System.out.print("Enter color: ");
        String color = input.nextLine();

        if (shapeChoice == 1) {
            System.out.print("Enter width: ");
            double width = input.nextDouble();
            System.out.print("Enter height: ");
            double height = input.nextDouble();
            shapes.add(new Rectangle(color, width, height));
        } else if (shapeChoice == 2) {
            System.out.print("Enter base: ");
            double base = input.nextDouble();
            System.out.print("Enter height: ");
            double height = input.nextDouble();
            shapes.add(new RightTriangle(color, base, height));
        } else if (shapeChoice == 3) {
            System.out.print("Enter side: ");
            double side = input.nextDouble();
            shapes.add(new Square(color, side));
        } else if (shapeChoice == 4) {
            System.out.print("Enter radius: ");
            double radius = input.nextDouble();
            shapes.add(new Circle(color, radius));
        }
    }

    private static void listShapes() {
        if (!shapes.isEmpty()) {
            for (Shape shape : shapes) {
                System.out.println(shape.getClass().getSimpleName() + " |Color: " + shape.getColor() + " | Dimensions: " + shape.getDimensions());
            }
        }{
            System.out.println("There are no shapes in list");
        }
    }

    private static void sumPerimeters() {
        if (!shapes.isEmpty()) {
            double sum = 0;
            for (Shape shape : shapes) {
                sum += shape.calculatePerimeter();
            }
            System.out.println("Sum of all Perimeters: " + sum);
        }{
            System.out.println("There are no shapes in list");
        }
    }

    private static void sumAreas() {
        if (!shapes.isEmpty()) {
            double sum = 0;
            for (Shape shape : shapes) {
                sum += shape.calculateArea();
            }
            System.out.println("Sum of all areas: " + sum);
        }{
            System.out.println("There are no shapes in list");
        }
    }

    private static void findBiggestPerimeter() {
        if (!shapes.isEmpty()) {
            double max = Double.MIN_VALUE;
            Shape biggest = null;
            for (Shape shape : shapes) {
                if (shape.calculatePerimeter() > max) {
                    max = shape.calculatePerimeter();
                    biggest = shape;
                }
            }
            System.out.println("Biggest Perimeter shape: " + biggest.getClass().getSimpleName() + " | Color: " + biggest.getColor() + " | Perimeter: " + biggest.calculatePerimeter());
        }{
            System.out.println("There are no shapes in list");
        }
    }

    private static void findBiggestArea() {
        if (!shapes.isEmpty()) {
            double max = Double.MIN_VALUE;
            Shape biggest = null;
            for (Shape shape : shapes) {
                if (shape.calculateArea() > max) {
                    max = shape.calculateArea();
                    biggest = shape;
                }
            }
            System.out.println("Biggest area shape: " + biggest.getClass().getSimpleName() + " | Color: " + biggest.getColor() + " | Area: " + biggest.calculateArea());
        }{
            System.out.println("There are no shapes in list");
        }
    }
}