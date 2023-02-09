package lesson12;

import java.util.Scanner;
class RightTriangle extends Shape {
    private double base;
    private double height;

    RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    String getDimensions() {
        return "Base: " + base + ", Height: " + height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }
}