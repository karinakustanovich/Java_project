package lesson13.vehicles;

import java.util.ArrayList;

public class MyVehicles {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bus("Man", 2023));
        vehicles.add(new Car("Tesla", 2022));
        vehicles.add(new Truck("DAF", 2019));

        vehicles.forEach(System.out::println);
        vehicles.forEach(Vehicle::whoAreYou);
    }
}

