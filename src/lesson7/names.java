package lesson7;

import java.util.HashMap;
import java.util.Map;

public class names {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1111, "Alex");
        hashMap.put(2222, "Irina");
        hashMap.put(3333, "Shura");
        hashMap.put(4444, "Karina");

//        System.out.println(hashMap.get(1111));
//        System.out.println(hashMap.get(1111222));
//        System.out.println(hashMap.containsKey(111122));
//        System.out.println(hashMap.containsValue(1111));
//        System.out.println(hashMap.containsValue(""));
//        System.out.println(hashMap.containsValue("Karina"));

        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));
        hashMap.put(5555, "Donald Trunp");
        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));
    }
}
