package lesson14.Basic;

import lesson14.Basic.InterfaceClass;

public class MyMain {
    public static void main(String[] args) {
        InterfaceClass interfaceClass = new InterfaceClass();
        System.out.println(interfaceClass.printInfoDefault(5, 6));
        System.out.println("interfaceClass.NAME = " + interfaceClass.NAME);
        BasicInterface.printInfo();
    }
}
