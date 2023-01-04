package lesson6;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        System.out.println("names.isEmpty()) = " + names.isEmpty());

        names.add("Alex");
        names.add("Nik");
        names.add("Olga");
        names.add("Marina");
        names.add("Alex");
        System.out.println("names.size() = " + names.size());

        System.out.println("names.isEmpty = " + names.isEmpty());

        names.forEach(name -> System.out.println(name));
    }
}
