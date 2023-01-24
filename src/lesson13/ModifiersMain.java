package lesson13;

import lesson12.ProtectedClass;
import lesson13.deaultPackage.DefaultClass;

public class ModifiersMain {
    public static void main(String[] args) {

        DefaultClass defaultClass = new DefaultClass();

        ProtectedClass.printCounter();

        System.out.println("ProtectedClass.counter = " + ProtectedClass.counter);


    }
}

