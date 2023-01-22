package lesson12;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     * Method calculates area
     * @return calculate area of the shape.
     */

    public abstract double calculateArea();

    public abstract  double calculatePerimeter();

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                '}';
    }
}
