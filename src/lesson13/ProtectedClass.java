package lesson13;

import lesson13.deaultPackage.DefaultClass;

public class ProtectedClass extends DefaultClass {

    public static final double FINAL_COUNTER = Math.PI;
    public static final String MY_NAME = "Alexander";

    private static int age;

    public ProtectedClass() {
        age++;
    }

    public void printDetails() {
        System.out.println(lastName);
//        static int number = 5; //static variable inside method triggers error
    }

    public static void printCounter() {
        System.out.println(FINAL_COUNTER);
    }


}
