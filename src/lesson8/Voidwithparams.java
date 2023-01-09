package lesson8;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Voidwithparams {
    public static void main(String[] args) {

        sayHello("Alex", 34);
        String studentName = "Donald Trump";
        sayHello(studentName, 70);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        printArrayList(arrayList);

    }

    public static void sayHello(String name, int age){
        System.out.println("Hello " + name + "!");
        System.out.println("You're " + age + " years old");
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.println("list.size() = " + list.size());
        System.out.println();
        list.forEach((number) -> System.out.println(number));
        System.out.println();

    }
}
