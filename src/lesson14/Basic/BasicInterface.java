package lesson14.Basic;

import lesson10.Car;

public interface BasicInterface {

    String NAME = "alex";

    //    public Car car; // triggers error

    // public and abstract by default
    void sayHello();

    static void printInfo() {
        System.out.println("Say Hello From Basic Interface");
    }

    default int printInfoDefault(int a, int b) {
        return sumNumbers(5,6);
    }

    private int sumNumbers(int a, int b) {
        return a+ b;
    }
}
