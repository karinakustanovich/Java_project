package lesson10;

public class MainCars {
    public static void main(String[] args) {

        Engine engine = new Engine(250, "v6", false);

        Wheel[] wheels = new Wheel[5];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(19, 2.5);

        }

        Car car = new Car("BMW", "model 3", 2022, engine, wheels);

        car.wheels[2].setRadius(-15);
        car.wheels[1].radius = -5;

        System.out.println(car);
        car.sayHello();

    }
}
