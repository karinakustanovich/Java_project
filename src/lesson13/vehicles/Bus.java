package lesson13.vehicles;

public class Bus extends Vehicle{

    public Bus(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a bus " + getBrand() + " " + getYear() + ".");
    }


}
