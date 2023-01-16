package lesson10;

public class MyCars {
    public static void main(String[] args) {

        Car car = new Car(
                "Tesla",
                "model x",
                2023,
                new Engine(500, "electrical", true),
                new Wheel[]
                        {
                                new Wheel(18, 2.4),
                                new Wheel(18, 2.4),
                                new Wheel(18, 2.4),
                                new Wheel(18, 2.4),
                                new Wheel(18, 2.4),

                        }
        );

        System.out.println(car);
    }
}

