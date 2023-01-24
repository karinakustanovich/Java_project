package lesson13.vehicles;

public class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a car " + getBrand() + " " + getYear());
    }
}
