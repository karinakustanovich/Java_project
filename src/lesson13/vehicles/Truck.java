package lesson13.vehicles;

public class Truck extends Vehicle {

    public Truck(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a car " + getBrand() + " " + getYear());
    }


}
