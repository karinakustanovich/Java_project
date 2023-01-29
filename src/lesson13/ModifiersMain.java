package lesson13;

import lesson12.ProtectedClass;
import lesson13.deaultPackage.DefaultClass;

public class ModifiersMain {
    public static void main(String[] args) {

        DefaultClass defaultClass = new DefaultClass();
//        System.out.println("defaultClass.name = " + defaultClass.name);  // triggers error of default access modifier.

        ProtectedClass.printCounter();
        System.out.println("ProtectedClass.MY_NAME = " + lesson13.ProtectedClass.MY_NAME);

        System.out.println("ProtectedClass.counter = " + ProtectedClass.FINAL_COUNTER);


//        ProtectedClass.counter = 56.7; / Cannot assign new value to the final variable
    }
}

