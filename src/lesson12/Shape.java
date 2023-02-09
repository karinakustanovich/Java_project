package lesson12;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Method calculates area
     * @return calculate area of the shape.
     */

    public abstract double calculateArea();

    public abstract  double calculatePerimeter();

    abstract String getDimensions();

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                '}';
    }
}