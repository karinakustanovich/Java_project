package lesson12;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cirlce{" +
                "radius=" + radius +
                " " + super.toString();
    }

    /**
     * Method calculates area
     * @return calculate area of the shape.
     */

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius = radius * Math.PI * 2;
    }
}


