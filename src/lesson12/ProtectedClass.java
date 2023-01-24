package lesson12;

import lesson13.deaultPackage.DefaultClass;

public class ProtectedClass extends DefaultClass {

    public static final double FINAL_COUNTER = Math.PI;

    public static  int age;

    public void printDetails() {
        System.out.println(lastName);
//        static int number = 5;
    }

    public static void printCounter() {
        System.out.println(FINAL_COUNTER);
    }

}
