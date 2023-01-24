package lesson13.deaultPackage;

import lesson13.deaultPackage.DefaultClass;

public class DefaultMain {
    public static void main(String[] args) {

        DefaultClass defaultClass = new DefaultClass();
        System.out.println("defaultClass.name = " +defaultClass.name);
        defaultClass.name = "Alexander";
        System.out.println("defaultClass.name = " +defaultClass.name);
    }
}
