package lesson12;

class Square extends Shape {
    private double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    String getDimensions() {
        return "Side: " + side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}