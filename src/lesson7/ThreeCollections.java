package lesson7;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreeCollections {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 1; i < 11; i++) {
            num.add(i);
        }

        names.add("Karina");
        names.add("Shura");
        names.add("Alex");
        names.add("Andrey");
        names.add("Egor");
        names.add("Pasha");
        names.add("Nikita");
        names.add("Roma");
        names.add("Ira");
        names.add("Olya");

        for (int i = 0; i < 10; i++) {
            hashMap.put(num.get(i), names.get(i));
        }

        hashMap.forEach((number, name) -> System.out.println(number + " - " + name));
    }
}
