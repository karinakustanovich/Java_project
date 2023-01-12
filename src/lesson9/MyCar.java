package lesson9;

public class MyCar {
    public MyCar() {
    }

    public static void main(String[] args) {

        System.out.println("car.wasCreated = " + car.wasCreated);

        car bmw = new car("red");
        bmw.carIsReady();
        car.classOccurrences();

        System.out.println("bmw.color = " + bmw.color);
        bmw.color = "Black";
        System.out.println("bmw.color = " + bmw.color);
        System.out.println("bmw.isElectrical = " + bmw.isElectrical);
        bmw.year = 2023;
        System.out.println("bmw.year = " + bmw.year);
        bmw.year = 223;
        System.out.println("bmw.year = " + bmw.year);

        //Create a car
        bmw.year = 2023;
        bmw.color = "white";
        bmw.isElectrical = true;
        bmw.model = "model 7";
        bmw.manufacturer = "BMW";

        //Create a second car
        car tesla = new car();
        car.classOccurrences();
        tesla.color = "white";
        tesla.year = 2022;

        System.out.println("tesla.manufacturer = " + tesla.manufacturer);

        car car = new car("green", 2019, "ford", "mustang", false);
//        car.printCarInfo();
        System.out.println(car);
        car.classOccurrences();

    }


}
